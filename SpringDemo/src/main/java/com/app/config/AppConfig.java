package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app")   //3  scan everything inside com.app package - model pac is scan
public class AppConfig {
}
