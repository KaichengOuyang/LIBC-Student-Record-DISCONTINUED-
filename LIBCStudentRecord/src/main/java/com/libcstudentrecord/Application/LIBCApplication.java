package com.libcstudentrecord.Application;

import Core.Storage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LIBCApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LIBCApplication.class.getResource("Training.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("LIBC Record");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Storage.studentData.add(new String[]{"Peter", "Kai", "516-904-6879", "Unlimited :)", "Never", "∞", "∞", "8/3/2022 | Group | 9:00am - 11:30am, 1:00pm - 3:30pmNS8/4/2022 | Group | 9:00am - 11:30am, 1:00pm - 3:30pm", "", "8/8/2022 9:00am - 11:30amNS8/8/2022 1:00pm - 3:30pm"});
        launch();
    }
}