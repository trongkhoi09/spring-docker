package com.nashtech.docker2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Slf4j
public class Docker2Application {

    public static void main(String[] args) {
        SpringApplication.run(Docker2Application.class, args);

        log.error("---------- Application started ---------------");
    }

}
