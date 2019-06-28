package com.covengers.grouping.gw;

import com.covengers.grouping.GroupingApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GwApplication extends GroupingApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GwApplication.class);
        app.addListeners(new GroupingApplicationListener());
        app.run(args);
    }
}
