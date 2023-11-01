package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Without Spring
//        ApplicationManager applicationManager = new ApplicationManager(new Calculator());

        // Using Spring context and xml config
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        // Using Spring context and annotations
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationManager applicationManager = applicationContext.getBean(ApplicationManager.class);
        applicationManager.openApplication();
    }
}