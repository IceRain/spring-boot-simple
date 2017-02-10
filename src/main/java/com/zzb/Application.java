package com.zzb;

/**
 * Created by zhaozb on 2017/2/10.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
//@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
//    @RequestMapping("/")
//    String home() {
//        return "Hello World!";
//    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}