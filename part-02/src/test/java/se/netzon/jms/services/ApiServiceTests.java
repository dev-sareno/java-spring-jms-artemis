package se.netzon.jms.services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
public class ApiServiceTests {

    @SpyBean
    ApiService apiService;

    @Test
    public void apiService_ShouldNotNull() {
        assertThat(apiService, is(notNullValue()));
    }

    // Service specific tests

}
