package se.netzon.jms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import se.netzon.jms.beans.Messages;
import se.netzon.jms.beans.Utility;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Utility utility() {
        return new Utility();
    }

    @Bean
    public Messages messages() {
        return new Messages();
    }

}
