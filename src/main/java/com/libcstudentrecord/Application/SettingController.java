package com.libcstudentrecord.Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public double Height;
    public double Width;

    @FXML
    private Button trainingButton;

    @FXML
    private Button scheduleButton;

    @FXML
    private Button reportButton;

    @FXML
    private Button settingButton;

    @FXML
    void trainingButton(ActionEvent event) throws IOException {
        System.out.println("Training button was clicked");
        root = FXMLLoader.load(getClass().getResource("Training.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Group");
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        Height = screenBounds.getHeight();
        Width = screenBounds.getWidth();
        stage.setWidth(Width);
        stage.setHeight(Height);
    }

    @FXML
    void scheduleButton(ActionEvent event) throws IOException {
        System.out.println("Schedule button was clicked");
        root = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Schedule");
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        Height = screenBounds.getHeight();
        Width = screenBounds.getWidth();
        stage.setWidth(Width);
        stage.setHeight(Height);
    }

    @FXML
    void reportButton(ActionEvent event) throws IOException {
        System.out.println("Schedule button was clicked");
        root = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Schedule");
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        Height = screenBounds.getHeight();
        Width = screenBounds.getWidth();
        stage.setWidth(Width);
        stage.setHeight(Height);
    }

    @FXML
    void settingButton(ActionEvent event) throws IOException {
        System.out.println("Schedule button was clicked");
        root = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Schedule");
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        Height = screenBounds.getHeight();
        Width = screenBounds.getWidth();
        stage.setWidth(Width);
        stage.setHeight(Height);
    }
}
