package org.scheduling.springquartzcluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringQuartzClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringQuartzClusterApplication.class, args);
    }

}
