package com.mslfox.simpleserverfordocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SimpleServerForDockerApplication {
    @Value("${inst.num:1}")
    private int instanceNumber;

    public static void main(String[] args) {

        SpringApplication.run(SimpleServerForDockerApplication.class, args);
    }
    @GetMapping("/")
    public String instanceNumber(){
        return "inst.num = " + instanceNumber;
    }


}
