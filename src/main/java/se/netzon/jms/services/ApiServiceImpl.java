package se.netzon.jms.services;

import org.springframework.stereotype.Service;
import se.netzon.jms.beans.Messages;

@Service
public class ApiServiceImpl implements ApiService {

    private final Messages messages;

    public ApiServiceImpl(Messages messages) {
        this.messages = messages;
    }

    @Override
    public String getIndexOrGreeting() {
        return this.messages.getGreeting();
    }

    @Override
    public String getShortText() {
        return this.messages.getShortText();
    }

    @Override
    public String getLongText() {
        return this.messages.getLongText();
    }

    @Override
    public String getAllText() {
        return this.messages.getAllText();
    }
}
