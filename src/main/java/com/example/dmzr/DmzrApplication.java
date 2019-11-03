package com.example.dmzr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class DmzrApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmzrApplication.class, args);
    }

}
