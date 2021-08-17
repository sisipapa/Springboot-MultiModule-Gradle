package com.sisipapa.study.multimodule.sub1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sisipapa.study.multimodule")
public class Sub1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sub1Application.class, args);
    }

}
