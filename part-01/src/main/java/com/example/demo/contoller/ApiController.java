package com.example.demo.contoller;

import com.example.demo.service.ApiService;
import com.example.demo.service.ApiServiceImpl;
import com.example.demo.service.DispatcherServerImpl;
import com.example.demo.service.DispatcherService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.ApiResponse;

@RestController()
public class ApiController {
    
    @Autowired
    ApiServiceImpl apiService;

    @Autowired
    DispatcherServerImpl dispatcherService;

    private Logger logger = LoggerFactory.getLogger(ApiController.class);

    @GetMapping("/hello")
    public String getHello(
        @RequestParam(name = "numberOfMessages", defaultValue = "100")
        int numberOfMessages,
        @RequestParam(name = "intervalMillis", defaultValue = "10000")
        long intervalMillis
    ) {
        logger.info("getHello() called.");

        if (numberOfMessages > 100) {
            numberOfMessages = 100;
        }

        String response = this.apiService.getHello();

        // Send jms
        this.dispatcherService.sendMessage(response, numberOfMessages, intervalMillis);

        return response;
    }

    @GetMapping("/send")
    public ResponseEntity<String> postSend(
        @RequestParam(name = "message")
        String message
    ) {
        return new ResponseEntity<String>("Message sent!", HttpStatus.OK);
    }

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public ResponseEntity<ApiResponse> getSayHi(
        @RequestParam(name = "name", required = true)
        String name
    ) {
        logger.info("getSayHi() called.");
        return this.apiService.getSayHi(name);
    }
}
