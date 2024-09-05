package com.citi.casemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CaseManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(CaseManagementApplication.class, args);
    }
}
