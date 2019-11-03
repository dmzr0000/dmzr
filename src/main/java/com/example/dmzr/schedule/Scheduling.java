package com.example.dmzr.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {

    @Scheduled(cron="* * * * * *")
    public void Schedule1() {
        System.out.println("TEST");
    }

}
