package com.covengers.grouping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextClosedEvent;

@Slf4j
@Configuration
public class GroupingApplication {
    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(GroupingApplication.class);
        app.addListeners(new GroupingApplicationListener());
        app.run(args);
    }

    public static class GroupingApplicationListener implements ApplicationListener<ApplicationEvent> {

        @Override
        public void onApplicationEvent(ApplicationEvent applicationEvent) {
            if (applicationEvent instanceof ApplicationReadyEvent) {
                log.info("Application is ready.");
            }

            if (applicationEvent instanceof ContextClosedEvent) {
                log.info("Application shuts down.");
            }
        }
    }
}
