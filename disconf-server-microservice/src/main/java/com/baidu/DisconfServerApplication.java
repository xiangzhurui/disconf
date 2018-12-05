package com.baidu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:/META-INF/applicationContext.xml"})
@SpringBootApplication
public class DisconfServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisconfServerApplication.class, args);
    }
}
