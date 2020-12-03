package com.example.demo.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { ApiServiceImpl.class })
public class ApiServiceTests {

    @Autowired
    ApiServiceImpl apiServiceImpl;

    @Test()
    public void shouldApiServiceInjected() {
        // Given

        // When

        // Then
        assertThat(this.apiServiceImpl, is(notNullValue()));
    }

    @Test()
    public void shouldServiceReturnEndswithParam() {
        // Given

        // When
        String response = this.apiServiceImpl.getHello();

        // Then
        assertThat(response, is(equalTo("Hello Java + SpringWeb")));
    }
}
