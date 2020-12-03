package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import model.ApiResponse;

@Service()
public class ApiServiceImpl implements ApiService {
    
    // @Autowired
    // JmsTemplate jmsTemplate;

    // @Value("${jms.queue}")
    // String jmsQueue;

    private Logger logger = LoggerFactory.getLogger(ApiServiceImpl.class);

    @Override
    public @ResponseBody String getHello() {
        return "Hello Java + SpringWeb";
    }

    @Override
    public @ResponseBody ResponseEntity<ApiResponse> getSayHi(String name) {
        return new ResponseEntity<ApiResponse>(new ApiResponse(String.format("Hi %s!", name)), HttpStatus.OK);
    }

    @Override
    public void sendMessage(String message) {
        // this.jmsTemplate.convertAndSend(this.jmsQueue, message);
    }
    
}
