package com.ryan.micro.demo;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ryan.micro.demo.mapper.UserMapper;
import com.ryan.micro.demo.model.User;
import com.ryan.micro.demo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserMapper userMapper) {
        return args -> {
            List<User> users = userMapper.selectList(Wrappers.query());
            System.out.println("users = " + users);
            try {
                TimeUnit.SECONDS.sleep(5);
                System.exit(0);
            } catch (InterruptedException ex) {

            }
        };
    }
}
