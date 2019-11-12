package com.example.dmzr.comm.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CommScheduling {

    @Scheduled(cron="* * * * * *")
    public void Schedule1() {
        System.out.println("TEST");
    }

}
