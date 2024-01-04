package com.fastcampus.springpractice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.fastcampus.springpractice")
@Configuration  //스프링 전용 configuration
public class Config {

}
