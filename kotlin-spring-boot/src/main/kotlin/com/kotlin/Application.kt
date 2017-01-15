package com.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
