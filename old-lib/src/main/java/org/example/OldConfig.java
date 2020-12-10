package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
public class OldConfig {

    @Bean
    public SomeBean someBean(){
        return new SomeBean();
    }


}
