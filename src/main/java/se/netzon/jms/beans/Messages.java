package se.netzon.jms.beans;

import org.springframework.beans.factory.annotation.Value;

public class Messages {

    @Value("${string.greeting}")
    private String greeting;

    @Value("${string.shortText}")
    private String shortText;

    @Value("${string.longText}")
    private String longText;

    public String getGreeting() {
        return greeting;
    }

    public String getShortText() {
        return shortText;
    }

    public String getLongText() {
        return longText;
    }

    public String getAllText() {
        return String.format("%s\n%s\n%s", greeting, shortText, longText);
    }
}
