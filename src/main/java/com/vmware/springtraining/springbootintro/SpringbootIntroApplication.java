package com.vmware.springtraining.springbootintro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootIntroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootIntroApplication.class, args);
    }

    @RestController
    @RequestMapping("/api")
    public class ApiController {

        @Value("${app.msg}")
        private String msg;

        @GetMapping("/greeting")
        public String getGreeting() {
            return msg;
        }
    }
}
