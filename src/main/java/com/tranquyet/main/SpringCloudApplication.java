package com.tranquyet.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.tranquyet.service", "com.tranquyet.service.impl",
        "com.tranquyet.controller", "com.tranquyet.controller.api"})
@EntityScan({"com.tranquyet.entity"})
@EnableJpaRepositories("com.tranquyet.repository")
@SpringBootApplication
public class SpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
        System.out.println("Hello World");
    }

}
