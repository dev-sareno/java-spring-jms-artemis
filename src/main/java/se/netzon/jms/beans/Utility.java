package se.netzon.jms.beans;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class Utility {

    // Injected from application.properties
    @Value("${greeting.hello}")
    String greetingHello;

    public String getTime() {
        return String.valueOf(new Date().getTime());
    }

    public String getGreetingHello() {
        return greetingHello;
    }
}
