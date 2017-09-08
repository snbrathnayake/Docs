package com.voodram.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.voodram")
public class RegionApplication {


    public static void main(String[] args) {
        SpringApplication.run(RegionApplication.class, args);
        System.out.println("\n<<<<<<<<<<< : RegionApplication Running : >>>>>>>>>>");
    }

}
