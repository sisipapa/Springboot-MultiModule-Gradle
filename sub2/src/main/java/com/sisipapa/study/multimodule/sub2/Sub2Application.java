package com.sisipapa.study.multimodule.sub2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sisipapa.study.multimodule" )
public class Sub2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sub2Application.class, args);
    }

}
