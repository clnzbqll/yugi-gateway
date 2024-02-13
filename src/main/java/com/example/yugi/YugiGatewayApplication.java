package com.example.yugi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class YugiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(YugiGatewayApplication.class, args);
        log.info("阿姨！一份儿童套餐");
    }

}
