package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ApplicationManager {
    // Field injection (but recommended way in constructor or setter injection)
//    @Autowired
//    @Qualifier("notepad")
    private Application application;

    // When using constructor injection

//    public ApplicationManager(Application application){
//        this.application = application;
//        System.out.println("User clicked on : " + application.getName());
//    }


    public Application getApplication() {
        return application;
    }

//    Autowired class finding ambiguity solution:

//    Autowired either matches Parameter TYPE (example Notepad (classname) )

//    @Autowired
//    public void setApplication(Notepad application) {
//        this.application = application;
//    }
//    --------------------------------------------
//    or NAME (example notepad or calculator)
//    @Autowired
//    public void setApplication(Application notepad) {
//        this.application = application;
//    }
//    -------------------------------------------------
//    or Add @Primary to the class you want to use
//    ----------------------------------------
//    or use @Qualifier("name of the instance variable for class"), this will override @Primary

    @Autowired
    public void setApplication(@Qualifier("notepad") Application application) {
        this.application = application;
    }

    public void openApplication() {
        this.application.open();
    }

}
