package org.scheduling.springschedulingquartz.config;

import org.quartz.*;
import org.scheduling.springschedulingquartz.task.MjtTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail uploadTaskDetail() {
        return JobBuilder.newJob(MjtTask.class).withIdentity("mjtTask").storeDurably().build();
    }

    @Bean
    public Trigger uploadTaskTrigger() {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail())
                .withIdentity("mjtTask")
                .withSchedule(scheduleBuilder)
                .build();
    }
}