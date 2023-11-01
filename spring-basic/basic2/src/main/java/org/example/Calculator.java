package org.example;

import org.springframework.stereotype.Component;

@Component
public class Calculator implements Application{
    public String name = "CALCULATOR";

    public String getName() {
        return name;
    }

    @Override
    public void open() {
        System.out.println("Opening Calculator Application");
    }

    @Override
    public void close() {
        System.out.println("Closing Calculator Application");
    }
}
