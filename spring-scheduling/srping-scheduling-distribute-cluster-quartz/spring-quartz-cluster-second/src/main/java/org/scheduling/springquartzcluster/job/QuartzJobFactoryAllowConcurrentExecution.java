package org.scheduling.springquartzcluster.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.scheduling.springquartzcluster.entity.ScheduleJob;
import org.scheduling.springquartzcluster.util.TaskUtils;

/** 允许并行执行 */
public class QuartzJobFactoryAllowConcurrentExecution implements Job {
 
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
        TaskUtils.invokeMethod(scheduleJob);
    }
}
