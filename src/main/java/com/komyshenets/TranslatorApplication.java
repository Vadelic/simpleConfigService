package com.komyshenets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TranslatorApplication {

    public static void main(String[] args) throws ClassNotFoundException {
        SpringApplication.run(TranslatorApplication.class, args);

    }
}
