package com.example.demo.service;

public interface DispatcherService {
    void sendMessage(String message, int numberOfMessages, long intervalMillis);
}
