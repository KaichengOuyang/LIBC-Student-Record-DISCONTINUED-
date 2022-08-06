package com.libcstudentrecord.Application;

import Core.Objects.Student;
import Core.Storage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.List;

public class TrainingController {
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
    private TextField nameTextfield;

    @FXML
    private TextField siblingTextfield;

    @FXML
    private TextField parentTextfield;

    @FXML
    private TextField packageTextfield;

    @FXML
    private TextField lastpaymentTextfield;

    @FXML
    private TextField creditsPTextfield;

    @FXML
    private TextField creditsGTextfield;

    @FXML
    private ListView<String> StudentsTableView;

    @FXML
    private ListView<String> previousSession;

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

    @FXML
    void updateButton(ActionEvent event) throws IOException{
        System.out.println("Update button was clicked");
        String nameField = nameTextfield.getText();
        String siblingField = siblingTextfield.getText();
        String parentField = parentTextfield.getText();
        String packageField = packageTextfield.getText();
        String lastpaymentField = lastpaymentTextfield.getText();
        String creditsPField = creditsPTextfield.getText();
        String creditsGField = creditsGTextfield.getText();
        System.out.println(nameField + " " + siblingField + " " + parentField + " " + packageField + " " + lastpaymentField + " " + creditsPField + " " + creditsGField);
    }

    @FXML public void handleMouseClick(MouseEvent arg0) {
        System.out.println("clicked on " + StudentsTableView.getSelectionModel().getSelectedItem());
        for(int i = 0; i < Storage.studentData.size(); i++){
            if(Storage.studentData.get(i)[0].equals(StudentsTableView.getSelectionModel().getSelectedItem())){
                nameTextfield.setText(Storage.studentData.get(i)[0]);
                siblingTextfield.setText(Storage.studentData.get(i)[1]);
                parentTextfield.setText(Storage.studentData.get(i)[2]);
                packageTextfield.setText(Storage.studentData.get(i)[3]);
                lastpaymentTextfield.setText(Storage.studentData.get(i)[4]);
                creditsPTextfield.setText(Storage.studentData.get(i)[5]);
                creditsGTextfield.setText(Storage.studentData.get(i)[6]);
            }
        }
        pastSessions();
    }

    @FXML
    void refreshButton (ActionEvent event) throws IOException {
        System.out.println("Refresh button was clicked");
        addStudentToList();
    }

    @FXML
    void newStudentClick(ActionEvent event) throws IOException{
        System.out.println("Added new student to array" + nameTextfield.getText() + " " + siblingTextfield.getText() + " " + parentTextfield.getText() + " " + packageTextfield.getText() + " " + lastpaymentTextfield.getText() + " " + creditsPTextfield.getText() + " " + creditsGTextfield.getText());
        addStudentToArray();
    }

    void addStudentToList(){
        StudentsTableView.getItems().clear();
        for(int i = 0; i < Storage.studentData.size(); i++){
            StudentsTableView.getItems().add(Storage.studentData.get(i)[0]);
        }
    }
    void addStudentToArray(){
        String nameField = nameTextfield.getText();
        String siblingField = siblingTextfield.getText();
        String parentField = parentTextfield.getText();
        String packageField = packageTextfield.getText();
        String lastpaymentField = lastpaymentTextfield.getText();
        String creditsPField = creditsPTextfield.getText();
        String creditsGField = creditsGTextfield.getText();
        String[] student = {nameField, siblingField, parentField, packageField, lastpaymentField, creditsPField, creditsGField};
        Storage.studentData.add(student);
    }

    void pastSessions(){
        for(int i = 0; i < Storage.studentData.size(); i++){
            if(Storage.studentData.get(i)[0].equals(StudentsTableView.getSelectionModel().getSelectedItem())){
                String[] PS = Storage.studentData.get(i)[7].split("NS");
                for(int j = 0; j < PS.length; j++){
                    if(PS[j]!=""){
                        previousSession.getItems().add(PS[j]);
                    } else{
                        previousSession.getItems().add("No previous sessions");
                    }
                }
            }
        }
    }
}
