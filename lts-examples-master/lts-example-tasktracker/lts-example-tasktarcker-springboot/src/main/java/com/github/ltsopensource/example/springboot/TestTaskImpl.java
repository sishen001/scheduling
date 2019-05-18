package com.github.ltsopensource.example.springboot;

import com.github.ltsopensource.core.logger.Logger;
import com.github.ltsopensource.core.logger.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestTaskImpl implements TestTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobRunnerImpl.class);

    @Override
    public String test(String json) {
        LOGGER.info("找到了指定的任务="+json);
        return "ok";
    }
}
