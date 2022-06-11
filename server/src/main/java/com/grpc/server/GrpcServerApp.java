package com.grpc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GrpcServerApp {
    public static void main(String[] args) {
        SpringApplication.run(GrpcServerApp.class, args);
        log.info("GRPC Server is up ..");
    }
}
