package org.scheduling.springschedulingquartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedulingQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulingQuartzApplication.class, args);
    }

}
