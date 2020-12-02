package se.netzon.jms.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.netzon.jms.beans.Utility;

@RestController
public class ApiController {
    private Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private Utility utility;

    @GetMapping("/")
    public String index() {
        this.logger.info(this.utility.getGreetingHello());
        return "Hello World!";
    }

}
