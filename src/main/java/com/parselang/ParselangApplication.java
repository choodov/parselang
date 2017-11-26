package com.parselang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ParselangApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ParselangApplication.class, args);
    }
}
