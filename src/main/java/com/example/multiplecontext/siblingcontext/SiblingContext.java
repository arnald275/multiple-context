package com.example.multiplecontext.siblingcontext;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:siblingcontext.properties")
@ComponentScan(basePackages = "com.example.multiplecontext.siblingcontext")
@Configuration
@EnableAutoConfiguration
public class SiblingContext {
}
