/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import db.DBConnection;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    @FXML
    private Label lblprojectsTab;

    @FXML
    private Label lblEventsTab;

    @FXML
    private Label lblInvestmentsTab;

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
        
        Connection connection;
        try {
            connection = DBConnection.getInstance().getConnection();
            Statement stmt=connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS row_count FROM Project");
            while(rs.next()){
                int rowCount = rs.getInt("row_count");
                lblprojectsTab.setText("Currently "+rowCount+" Projects are active");
                
            }
            stmt.close();
            Statement stmt2=connection.createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT COUNT(*) AS row_count2 FROM event");
            while(rs.next()){
                int rowCount2 = rs.getInt("row_count2");
                lblEventsTab.setText("Currently "+rowCount2+" Projects are available");
                
            }
            stmt2.close();
            Statement stmt3=connection.createStatement();
            ResultSet rs3 = stmt3.executeQuery("SELECT COUNT(*) AS row_count3 FROM invest");
            while(rs.next()){
                int rowCount3 = rs.getInt("row_count3");
                lblInvestmentsTab.setText("Currently "+rowCount3+" Projects are available");
                
            }
            stmt3.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Class couldn't be found.");
        } catch (SQLException ex) {
            System.out.println("Error of database connection.");
        }
        
       
        
        
        
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
    private void investmentsOnClick(MouseEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/Investment.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @FXML
    private void projectsOnClick(MouseEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/Project.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
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
    
    @FXML
    void imgAddUserOnAction(MouseEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/Profile.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
    
   
     @FXML
    void lblAddUserOnAction(MouseEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/Profile.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
    
    @FXML
    void EventsTab(MouseEvent event) {

    }

    @FXML
    void InvestmentsTab(MouseEvent event) {

    }

    @FXML
    void ProjectsTab(MouseEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/Project.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
    
}
