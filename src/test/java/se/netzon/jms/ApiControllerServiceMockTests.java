package se.netzon.jms;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import se.netzon.jms.controllers.ApiController;
import se.netzon.jms.services.ApiService;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ApiControllerServiceMockTests {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ApiController apiController;

    @MockBean
    ApiService apiService;

    @Test
    public void apiService_GetIndex_ShouldBeCalledOnce() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/"))

                // Just to ensure the call succeeded
                .andExpect(status().isOk());

        // Then
        verify(this.apiService, times(1)).getIndexOrGreeting();
    }

    @Test
    public void apiService_GetGreeting_ShouldBeCalledOnce() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/greet"))

                // Just to ensure the call succeeded
                .andExpect(status().isOk());

        // Then
        verify(this.apiService, times(1)).getIndexOrGreeting();
    }

    @Test
    public void apiService_GetShortText_ShouldBeCalledOnce() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/shortText"))

                // Just to ensure the call succeeded
                .andExpect(status().isOk());

        // Then
        verify(this.apiService, times(1)).getShortText();
    }

    @Test
    public void apiService_GetLongText_ShouldBeCalledOnce() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/longText"))

                // Just to ensure the call succeeded
                .andExpect(status().isOk());

        // Then
        verify(this.apiService, times(1)).getLongText();
    }

    @Test
    public void apiService_GetAllText_ShouldBeCalledOnce() throws Exception {
        // Given

        // When
        this.mockMvc.perform(get("/allText"))

                // Just to ensure the call succeeded
                .andExpect(status().isOk());

        // Then
        verify(this.apiService, times(1)).getAllText();
    }
}
