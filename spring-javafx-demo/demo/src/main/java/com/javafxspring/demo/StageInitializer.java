package com.javafxspring.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StageInitializer implements ApplicationListener<FxApplication.StageReadyEvent> {

    @Value("classpath:/welcome.fxml")
    private Resource welcomeResource;

    @Override
    public void onApplicationEvent(FxApplication.StageReadyEvent stageReadyEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(welcomeResource.getURL());
            Parent parent = fxmlLoader.load();
            Stage stage = stageReadyEvent.getStage();
            stage.setScene(new Scene(parent,1200,600));
            stage.show();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
