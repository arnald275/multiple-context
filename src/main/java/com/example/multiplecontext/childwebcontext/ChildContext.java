package com.example.multiplecontext.childwebcontext;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.multiplecontext.childwebcontext")
@EnableAutoConfiguration
@PropertySource("classpath:childcontext.properties")
public class ChildContext {

}
