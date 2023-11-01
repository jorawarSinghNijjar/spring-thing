package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") or @Scope("prototype")
public class Notepad implements Application, InitializingBean, DisposableBean {
    public String name = "NOTEPAD";

    public String getName() {
        return name;
    }

    @Override
    public void open() {
        System.out.println("Opening Notepad Application");
    }

    @Override
    public void close() {
        System.out.println("Closing Notepad Application");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This method is called after bean is initialized.........");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroyed properties........");
    }
}
