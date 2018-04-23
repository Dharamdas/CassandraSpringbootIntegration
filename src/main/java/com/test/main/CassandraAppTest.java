package com.test.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.test")
public class CassandraAppTest {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CassandraAppTest.class, args);
    }
}
