package com.ICF.Demo.ICF_Project.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrossOrginConfig {

    @Bean
    public WebMvcConfigurer configurer(){
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/api/rmpu/**")
                        .allowedHeaders("http://127.0.0.1:5500")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*");
            }
        };
    }
}
