package cz.inventi.academy.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring/xml-context.xml" });

        MessageService messageService = context.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());

        context.registerShutdownHook();
    }
}