package com.covengers.grouping.api.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(1)
@ComponentScan(
        basePackages = {
                "com.covengers.grouping.annotation"
        }
)
public class ComponentScanConfiguration {
}
