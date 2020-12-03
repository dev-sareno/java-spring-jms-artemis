package se.netzon.jms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import se.netzon.jms.beans.Messages;
import se.netzon.jms.controllers.ApiController;
import se.netzon.jms.services.ApiService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerResponsesTests {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ApiController apiController;

    @SpyBean  // Spy not Mock, because Mock blocks the original call.
    ApiService apiService;

    @SpyBean
    Messages messages;

    @Test
    public void apiController_ShouldNotNull() {
        assertThat(apiController, is(notNullValue()));
    }

    @Test
    public void apiService_ShouldNotNull() {
        assertThat(apiService, is(notNullValue()));
    }

    @Test
    public void apiController_GetIndex_ShouldReturnExactValueFromApplicationProperties() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/"))
                .andDo(print())

                // Then
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString(this.messages.getGreeting())));
    }

    @Test
    public void apiController_GetGreet_ShouldReturnExactValueFromApplicationProperties() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/greet"))
                .andDo(print())

                // Then
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString(this.messages.getGreeting())));
    }

    @Test
    public void apiController_GetShortText_ShouldReturnExactValueFromApplicationProperties() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/shortText"))
                .andDo(print())

                // Then
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString(this.messages.getShortText())));
    }

    @Test
    public void apiController_GetLongText_ShouldReturnExactValueFromApplicationProperties() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/longText"))
                .andDo(print())

                // Then
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString(this.messages.getLongText())));
    }

    @Test
    public void apiController_GetAllText_ShouldReturnExactValueFromApplicationProperties() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/allText"))
                .andDo(print())

                // Then
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString(this.messages.getAllText())));
    }

}
