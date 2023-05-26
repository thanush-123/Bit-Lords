/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import com.mysql.cj.protocol.Resultset;
import db.DBConnection;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Admin;
import model.Person;


/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LoginFormController implements Initializable {

    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtPassword;
    @FXML
    private Hyperlink lnkCreateAccount;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void lnkCreateAccountOnClick(ActionEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/RegisterForm.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @FXML
    private void btnLoginOnAction(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stmt=connection.prepareStatement("select * from user where userName='"+txtUserName.getText()+"'and Password='"+txtPassword.getText()+"'");
        try{ 
            ResultSet rs = stmt.executeQuery();
          
           if(rs.next()){
               //Person person=new Admin();
               String name=rs.getString(8);
                String password=rs.getString(9);
                System.out.println(name+password);
               
           }
        }catch(SQLException e){
            System.out.println(e.getCause());
            //Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"successfully Registered");
            //alert.setTitle("Confirmation alert");
            //alert.setHeaderText("NOW YOU CAN START THE JOURNEY.");
            //alert.setContentText("Login to your account");
            //Optional<ButtonType> result = alert.showAndWait();
        }
        

        Parent parent=FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage=(Stage) root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    
    }
}
