/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class RegisterFormController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnRegister;
    @FXML
    private Hyperlink lnkLogin;
    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtConfirmPassword;
    @FXML
    private Label lblUserName;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblPassword;
    @FXML
    private Label lblConfirmPassword;
    
    
    
//     
//     
//     
//     
     
//     
//     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnBackOnAction(ActionEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage  = (Stage)root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @FXML
    private void btnRegisterOnAction(ActionEvent event) {
       
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"successfully Registered");
        alert.setTitle("Confirmation alert");
        alert.setHeaderText("NOW YOU CAN START THE JOURNEY.");
        alert.setContentText("Login to your account");
        Optional<ButtonType> result = alert.showAndWait();
        
    }
    @FXML
    private void lnkLoginOnClick(ActionEvent event) throws IOException {
        Parent parent=FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage  = (Stage)root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    @FXML
    private void txtUserNameOnAction(ActionEvent event) {
        String userName = txtUserName.getText();
        Pattern patternUserName=Pattern.compile("[aeiou]");
        Matcher matcher=patternUserName.matcher(userName);
        if(matcher.find()){
           lblUserName.setText(" ");
           txtEmail.requestFocus();
        }else{
            lblUserName.setText("Invalid Entry..");
        }
        
    }
    @FXML
    private void txtEmailOnAction(ActionEvent event) {
        String email = txtEmail.getText();
        Pattern patternEmail=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher=patternEmail.matcher(email);
        if(matcher.find()){
           lblEmail.setText(" ");
           txtPassword.requestFocus();
        }else{
            lblEmail.setText("Invalid Entry..");
        }
    }

    @FXML
    private void txtPasswordOnAction(ActionEvent event) {
        String password= txtPassword.getText();
        Pattern patternPassword=Pattern.compile("[aeiou]");
        Matcher matcher=patternPassword.matcher(password);
        if(matcher.find()){
           lblPassword.setText(" ");
           txtConfirmPassword.requestFocus();
        }else{
            lblPassword.setText("Invalid Entry..");
        }
        
        
    }

    @FXML
    private void txtConfirmPasswordOnAction(ActionEvent event) {
        String confirmPassword = txtConfirmPassword.getText();
        Pattern patternPassword=Pattern.compile("[aeiou]");
        Matcher matcher=patternPassword.matcher(confirmPassword);
        if(matcher.find()){
           lblConfirmPassword.setText(" ");
           btnRegister.requestFocus();
        }else{
            lblConfirmPassword.setText("Invalid Entry..");
        }
    }

    
}

    
