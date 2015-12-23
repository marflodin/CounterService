package com.marflo.ms.counterservice.service;

import com.marflo.ms.counterservice.service.endpoints.CounterController;
import com.marflo.ms.counterservice.service.endpoints.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class CounterServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "counter-server");
        SpringApplication.run(CounterServer.class, args);
    }

    @Bean
    public HomeController homeController() {
        return new HomeController();
    }

    @Bean
    public CounterController counterController() {
        return new CounterController();
    }
}
