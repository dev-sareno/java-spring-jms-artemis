package se.netzon.jms.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
public class ApiControllerTests {

    @Autowired
    ApiController apiController;

    @Test
    public void apiController_NotNull() {
        assertThat(apiController, is(notNullValue()));
    }

    // Controller specific tests

}
