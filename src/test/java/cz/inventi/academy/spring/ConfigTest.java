package cz.inventi.academy.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import cz.inventi.academy.spring.Config;

@Configuration
@Import(Config.class)
public class ConfigTest {
}