/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DashBoardController implements Initializable {

    @FXML
    private Label lblTimeStatus;
    @FXML
    private Label lblUserName;
    @FXML
    private BorderPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LocalTime currentTime = LocalTime.now();
        LocalTime nightLimit=LocalTime.of(18,00,00);
        int nightCompareTime=currentTime.compareTo(nightLimit);
        LocalTime afternoonLimit=LocalTime.of(12,00,00);
        int afternoonCompareTime=currentTime.compareTo(afternoonLimit);
       
        
        
        
        System.out.println(currentTime);
        if(nightCompareTime>0){
            lblTimeStatus.setText("Good Night,");
            System.out.println("Good Night");
        }else if(afternoonCompareTime>0) {
            lblTimeStatus.setText("Good Afternoon ,");
            System.out.println("Good Evening");
        }else{
            lblTimeStatus.setText("Good Morning ,");
            System.out.println("Good Morning ,");
        }
        
    }    

    @FXML
    private void dashboardOnClick(MouseEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @FXML
    private void investmentsOnClick(MouseEvent event) {
//         Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
//        Scene scene = new Scene(parent);
//        Stage primaryStage=(Stage) root.getScene().getWindow();
//        primaryStage.setScene(scene);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
    }

    @FXML
    private void projectsOnClick(MouseEvent event) {
//         Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
//        Scene scene = new Scene(parent);
//        Stage primaryStage=(Stage) root.getScene().getWindow();
//        primaryStage.setScene(scene);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
    }

    @FXML
    private void EventsOnClick(MouseEvent event) {
//         Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
//        Scene scene = new Scene(parent);
//        Stage primaryStage=(Stage) root.getScene().getWindow();
//        primaryStage.setScene(scene);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
    }

    @FXML
    private void ContactOnClick(MouseEvent event) {
//         Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
//        Scene scene = new Scene(parent);
//        Stage primaryStage=(Stage) root.getScene().getWindow();
//        primaryStage.setScene(scene);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
    }    
    private void clickProfile(ActionEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/Profile.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    
    }
    
}
