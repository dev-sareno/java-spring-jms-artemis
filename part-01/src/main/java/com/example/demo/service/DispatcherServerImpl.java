package com.example.demo.service;

import org.apache.activemq.artemis.api.core.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessagePostProcessor;
import org.springframework.stereotype.Service;

@Service
public class DispatcherServerImpl implements DispatcherService {

    private Logger logger = LoggerFactory.getLogger(DispatcherServerImpl.class);

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.queue}")
    String jmsQueue;

    @Override
    public void sendMessage(String message, final int numberOfMessages, long intervalMillis) {
        long nowMillis = System.currentTimeMillis();
        for (int i = 0; i < numberOfMessages; i++) {
            final int outI = i;
            this.jmsTemplate.convertAndSend(this.jmsQueue, message, 
            (MessagePostProcessor) msg -> {
                long period = nowMillis + (outI * intervalMillis);
                logger.info("period=" + period);
                msg.setLongProperty(Message.HDR_SCHEDULED_DELIVERY_TIME.toString(), period);
                return msg;
            });
        }
    }
    
}
