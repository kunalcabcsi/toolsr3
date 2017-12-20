package com.clincab.e2br3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class E2br3Application {

    private final Logger logger = LoggerFactory.getLogger(E2br3Application.class);

    public static void main(String[] args) {
        SpringApplication.run(E2br3Application.class, args);
    }
}
