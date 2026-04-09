package com.restaurant.bai1;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;


public class WebConfig {
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("/WEB-INF/templates/");
        resolver.setSuffix(".html");
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }
}
