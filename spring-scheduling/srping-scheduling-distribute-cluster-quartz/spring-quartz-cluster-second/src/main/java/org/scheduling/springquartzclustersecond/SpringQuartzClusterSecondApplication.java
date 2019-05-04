package org.scheduling.springquartzclustersecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringQuartzClusterSecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringQuartzClusterSecondApplication.class, args);
    }

}
