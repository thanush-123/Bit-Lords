/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import tm.InvestmentTM;
import tm.ProjectTM;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class InvestmentController implements Initializable {

    @FXML
    private BorderPane root;
    @FXML
    private TableView<InvestmentTM> tblProject;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       loadTable();
       tblProject.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("id"));
       tblProject.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("pId"));
       tblProject.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("pName"));
       tblProject.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("price"));
       tblProject.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("total"));
    }
     public void loadTable(){
        ObservableList<InvestmentTM> items = tblProject.getItems();
        items.clear();
        items.add(new InvestmentTM("001","001","projectName","300","4500"));
        tblProject.refresh();
        
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
        Parent parent=FXMLLoader.load(getClass().getResource("../view/project.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @FXML
    private void EventsOnClick(MouseEvent event) {
    }

    @FXML
    private void ContactOnClick(MouseEvent event) {
    }

    @FXML
    private void btnBackOnAction(MouseEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @FXML
    private void btnAddRefreshOnAction(MouseEvent event) {
    }
    
}
