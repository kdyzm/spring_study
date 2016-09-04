package com.kdyzm.spring.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.kdyzm.spring.springstudy.config.Config;

@EnableAutoConfiguration
@Import(value = { Config.class })
public class Application 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
    }
}
