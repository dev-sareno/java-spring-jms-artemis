package se.netzon.jms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.netzon.jms.beans.Utility;

@Configuration
public class AppConfig {

    @Bean
    public Utility utility() {
        return new Utility();
    }

}
