package ru.fiarr4ik.springbootstarterauditlib.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "ru.fiarr4ik.springbootstarterauditlib")
@EnableWebMvc
public class MainConfig {
}
