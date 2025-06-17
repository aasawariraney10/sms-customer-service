package com.simulator.sms.customer.service.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI smsCustomerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SMS Customer Service API")
                        .version("v1.0")
                        .description("API documentation for SMS Customer Service"));
    }
}
