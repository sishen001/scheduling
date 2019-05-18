package com.github.ltsopensource.example.springboot;

import com.alibaba.fastjson.JSONObject;
import com.github.ltsopensource.core.domain.Action;
import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.core.logger.Logger;
import com.github.ltsopensource.core.logger.LoggerFactory;
import com.github.ltsopensource.spring.boot.annotation.JobRunner4TaskTracker;
import com.github.ltsopensource.tasktracker.Result;
import com.github.ltsopensource.tasktracker.logger.BizLogger;
import com.github.ltsopensource.tasktracker.runner.JobContext;
import com.github.ltsopensource.tasktracker.runner.JobRunner;
import org.springframework.util.StringUtils;

/**
 * @author Robert HG (254963746@qq.com) on 4/9/16.
 */
@JobRunner4TaskTracker
public class JobRunnerImpl implements JobRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(JobRunnerImpl.class);

    @Override
    public Result run(JobContext jobContext) throws Throwable {
        try {
            BizLogger bizLogger = jobContext.getBizLogger();

            // TODO 业务逻辑
            LOGGER.info("我要执行：" + jobContext);
            // 会发送到 LTS (JobTracker上)
            bizLogger.info("测试，业务日志啊啊啊啊啊");
            runTask(jobContext.getJob());
        } catch (Exception e) {
            LOGGER.info("Run job failed!", e);
            return new Result(Action.EXECUTE_FAILED, e.getMessage());
        }
        return new Result(Action.EXECUTE_SUCCESS, "执行成功了，哈哈");
    }

    /**
     * 执行任务
     */
    private void runTask(Job job){
        String taskId = job.getTaskId();
        if(null != taskId){
            String className= taskId.substring(0,taskId.lastIndexOf("."));
            String methodName = taskId.substring(taskId.lastIndexOf(".") + 1,taskId.length());

            JSONObject json = new JSONObject();
            json.put("shopId9",job.getParam("shopId"));
           try{
               Object result = FutureUtil.reflectUtil(className,methodName,json);
               LOGGER.info("result="+result);
           }catch(Exception e){
               e.printStackTrace();
           }
        }
    }
}
