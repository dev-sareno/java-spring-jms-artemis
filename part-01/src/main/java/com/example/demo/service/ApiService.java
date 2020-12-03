package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import model.ApiResponse;

public interface ApiService {
    String getHello();
    ResponseEntity<ApiResponse> getSayHi(String name);
    void sendMessage(String message);
}
