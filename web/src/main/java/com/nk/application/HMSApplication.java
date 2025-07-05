package com.nk.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nk.*"})
@EntityScan(basePackages = {"com.nk.*"})
@EnableJpaRepositories(basePackages = {"com.nk.*"})
public class HMSApplication {

    public static void main(String[] args){
        SpringApplication.run(HMSApplication.class);
    }
}
