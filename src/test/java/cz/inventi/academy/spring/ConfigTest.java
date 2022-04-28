package cz.inventi.academy.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Config.class)
public class ConfigTest {
}