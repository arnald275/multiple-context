package com.example.multiplecontext.parentcontext;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.example.multiplecontext.parentcontext")
@Configuration
@EnableAutoConfiguration
@PropertySource("classpath:parentcontext.properties")
public class ParentContext {
}
