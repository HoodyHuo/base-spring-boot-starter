package vip.hoody.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import vip.hoody.service.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ComponentScan(basePackages = {"vip.hoody"})
public class MyConfiguration {

    @Bean
    DemoService getDemoService() {
        return new DemoService();
    }
}
