package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiverServiceImpl implements ReceiverService {
    
    Logger logger = LoggerFactory.getLogger(ReceiverServiceImpl.class);

    @JmsListener(destination = "${jms.queue}")
    @Override
    public void receiveMessage(String message) {
        logger.info("receiced a message=" + message);
    }
}
