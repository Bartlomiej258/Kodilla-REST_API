package com.crud.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringWebResrApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebResrApiApplication.class, args);
    }

}
