package com.example.dmzr.work1.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Work1Scheduling {

    @Scheduled(cron="* * * * * *")
    public void Schedule1() {
        System.out.println("TEST");
    }

}
