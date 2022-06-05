package com.example.batch2.batch;

import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@AllArgsConstructor
public class BatchScheduler {

    private Job job;
    private JobLauncher jobLauncher;

    @Scheduled(cron = "0/5 * * * * *")
    public void executeJob() {
        try {
            jobLauncher.run(job, new JobParametersBuilder().addString("datatime", LocalDateTime.now().toString()).toJobParameters());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
