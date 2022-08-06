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
        FXMLLoader fxmlLoader = new FXMLLoader(LIBCApplication.class.getResource("Schedule.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("LIBC Record");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Storage.studentData.add(new String[]{"John", "Smith", "123456789", "Core.Objects.Package", "$0.00", "0", "0", "8/5/2022 | Private | Ernita | 6:30pm - 7:30pmNS8/6/2022"});
        launch();
    }
}