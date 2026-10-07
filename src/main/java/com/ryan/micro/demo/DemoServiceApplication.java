package com.ryan.micro.demo;

import com.ryan.micro.demo.model.User;
import com.ryan.micro.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@Slf4j
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserService userService) {
        return args -> {
            List<User> users = userService.list();
            System.out.println("users = " + users);
            log.info("users: {}", users);
            try {
                TimeUnit.SECONDS.sleep(5);
                System.exit(0);
            } catch (InterruptedException ex) {

            }
        };
    }
}
