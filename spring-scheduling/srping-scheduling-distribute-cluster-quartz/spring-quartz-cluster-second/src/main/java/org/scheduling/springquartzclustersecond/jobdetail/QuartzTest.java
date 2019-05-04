package org.scheduling.springquartzclustersecond.jobdetail;

import org.springframework.stereotype.Component;

@Component("QuartTest")
public class QuartzTest {

    public void test(){
        System.out.println("這是 一個分佈式調度");
    }
}
