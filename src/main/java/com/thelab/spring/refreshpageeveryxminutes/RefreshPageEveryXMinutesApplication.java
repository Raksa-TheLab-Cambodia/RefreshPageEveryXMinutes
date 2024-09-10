package com.thelab.spring.refreshpageeveryxminutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RefreshPageEveryXMinutesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefreshPageEveryXMinutesApplication.class, args);
    }

}
