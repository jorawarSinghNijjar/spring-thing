package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.example")
public class AppConfig {

//    @Bean(name = "applicationManager")
//    public ApplicationManager createApplicationManager(){
//        ApplicationManager applicationManager = new ApplicationManager();
//        applicationManager.setApplication(createNotepad());
//        return applicationManager;
//    }
//
//    @Bean(name = "notepad")
//    public Notepad createNotepad(){
//        return new Notepad();
//    }
//
//    @Bean(name = "calculator")
//    public Calculator createCalculator(){
//        return new Calculator();
//    }

}
