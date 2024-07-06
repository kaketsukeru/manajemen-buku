package donny.application.configuration.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {
    @Bean
    public String TestPrint(){
        System.out.println("This is an example of bean class. Class must not be void");
        return null;
    }
}
