package se.netzon.jms.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiControllerTests {

    @Autowired
    ApiController apiController;

    @Test
    public void apiController_NotNull() {
        Assertions.assertThat(apiController).isNotNull();
    }

}
