package com.tranquyet.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.tranquyet"})
@EntityScan(basePackages = {"com.tranquyet"})
//@EnableJpaRepositories(basePackages = "com.tranquyet.repository")
@SpringBootApplication
public class SpringCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
        System.out.println("Hello World");
    }

}
