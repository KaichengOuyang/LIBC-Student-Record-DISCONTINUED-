package com.libcstudentrecord.Application;

import Core.IO.Exporter;
import Core.IO.Reader;
import Core.Objects.Student;
import Core.Storage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class TrainingController implements Initializable {
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
    private ListView<String> privateListView;

    @FXML
    private ListView<String> groupListView;

    @FXML
    private Button upcomingRefresh;

    @FXML
    private MenuItem menuOpenButton;

    @FXML
    private Button newStudent;

    FileChooser fileChooser = new FileChooser();

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
        System.out.println("Report button was clicked");
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
        System.out.println("Setting button was clicked");
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
        for(int i = 0; i < Storage.studentData.size(); i++){
            if(Storage.studentData.get(i)[0].equals(StudentsTableView.getSelectionModel().getSelectedItem())){
                Storage.studentData.get(i)[0] = nameField;
                Storage.studentData.get(i)[1] = siblingField;
                Storage.studentData.get(i)[2] = parentField;
                Storage.studentData.get(i)[3] = packageField;
                Storage.studentData.get(i)[4] = lastpaymentField;
                Storage.studentData.get(i)[5] = creditsPField;
                Storage.studentData.get(i)[6] = creditsGField;
            }
        }
    }

    @FXML public void handleMouseClick(MouseEvent arg0) {
        System.out.println("Clicked on " + StudentsTableView.getSelectionModel().getSelectedItem());
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
        previousSession.getItems().clear();
        pastSessions();
        addStudentToupcomingList();
    }

    @FXML
    void refreshButton (ActionEvent event) throws IOException {
        System.out.println("Refresh button was clicked");
        addStudentToList();;
    }

    @FXML
    void newStudentClick(ActionEvent event) throws IOException{
        System.out.println("New student button was clicked");
        addStudentToArray();
    }

    @FXML
    void saveButton(ActionEvent event) {
        System.out.println("Save button was clicked");
        File file = fileChooser.showSaveDialog(stage);
        fileChooser.setTitle("Save File");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Excel", "*.csv"));
        if(file != null){
            try{
                PrintWriter writer = new PrintWriter(file);
                writer.print(Exporter.outputStudent());
                writer.close();
            }catch(IOException e){
                System.out.println("Error");
            }
        }
    }

    @FXML
    void menuOpenButton(ActionEvent event) throws IOException {
        File file = fileChooser.showOpenDialog(new Stage());
        if(file != null){
            Reader.readStudent(file.getAbsolutePath());
        }
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
        String[] student = {nameField, siblingField, parentField, packageField, lastpaymentField, creditsPField, creditsGField, "", ""};
        Storage.studentData.add(student);
    }

    void pastSessions(){
        for(int i = 0; i < Storage.studentData.size(); i++){
            if(Storage.studentData.get(i)[0].equals(StudentsTableView.getSelectionModel().getSelectedItem())){
                try{
                String[] PS = Storage.studentData.get(i)[7].split("NS");
                previousSession.getItems().clear();
                for(int j = 0; j < PS.length; j++){
                    if(PS[j]!=""){
                        previousSession.getItems().add(PS[j]);
                    } else{
                        previousSession.getItems().add("No previous sessions");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e){
                    previousSession.getItems().add("No previous sessions");
                }
            }
        }
    }
    void addStudentToupcomingList(){
        privateListView.getItems().clear();
        for(int i = 0; i < Storage.studentData.size(); i++){
            if(Storage.studentData.get(i)[0].equals(StudentsTableView.getSelectionModel().getSelectedItem())){
                try{
                    String[] PS = Storage.studentData.get(i)[8].split("NS");
                    privateListView.getItems().clear();
                    for(int j = 0; j < PS.length; j++){
                        if(PS[j]!=""){
                            privateListView.getItems().add(PS[j]);
                        } else{
                            privateListView.getItems().add("No upcoming sessions");
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    privateListView.getItems().add("No upcoming sessions");
                }
            }
        }
        groupListView.getItems().clear();
        for(int i = 0; i < Storage.studentData.size(); i++){
            if(Storage.studentData.get(i)[0].equals(StudentsTableView.getSelectionModel().getSelectedItem())){
                try{
                    String[] PS = Storage.studentData.get(i)[9].split("NS");
                    groupListView.getItems().clear();
                    for(int j = 0; j < PS.length; j++){
                        if(PS[j]!=""){
                            groupListView.getItems().add(PS[j]);
                        } else{
                            groupListView.getItems().add("No upcoming sessions");
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    groupListView.getItems().add("No upcoming sessions");
                }
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
    }
}
