package com.hackaton.agrotech;

import com.hackaton.agrotech.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AgrotechApplication {

    static EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(AgrotechApplication.class, args);
        emailService = new EmailService();
//        emailService.sendMessage("Hello World!");
    }

}
