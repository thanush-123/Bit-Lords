/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import tm.ProjectTM;

/**
 *
 * @author Asus
 */
public class BlueprintController {
   
      @FXML
    private BorderPane root;

    @FXML
    private TableView<ProjectTM> tblBlueprint;

   
    
    
   
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
//        Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
//        Scene scene = new Scene(parent);
//        Stage primaryStage=(Stage) root.getScene().getWindow();
//        primaryStage.setScene(scene);
//        primaryStage.centerOnScreen();
//        primaryStage.show();
    }

    @FXML
    private void projectsOnClick(MouseEvent event) {
//        Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
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

}
