package org.scheduling.springquartzcluster.config;

import lombok.Data;
import org.scheduling.springquartzcluster.entity.ScheduleJob;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "quartz")
@Component
public class QuartzConfig {
    private List<ScheduleJob> jobs = new ArrayList<ScheduleJob>();
}