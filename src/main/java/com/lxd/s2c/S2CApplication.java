package com.lxd.s2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

/**
 * @author Administrator
 */
@SpringBootApplication
public class S2CApplication {

    public static void main(String[] args) {
        SpringApplication.run(S2CApplication.class, args);


        if (args.length == 2) {
            System.out.println("args is true.");
        }
        else {
            System.out.println("args is false.");
        }
    }
}
