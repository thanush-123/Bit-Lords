/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;


import db.DBConnection;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class RegisterFormController implements Initializable {


 
    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAge;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnRegister;

    @FXML
    private Hyperlink lnkLogin;

    private Label lblUserName;


    @FXML
    private TextField txtCountry;

    @FXML
    private TextField txtMobileNumber;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField pwdPassword;

    @FXML
    private PasswordField pwdConfirmPassword;
    
    @FXML
    private ToggleGroup gender;
    @FXML
    private RadioButton rdbtnMale;
    @FXML
    private RadioButton rdbtnFemale;

    
    
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

    private void btnRegisterOnAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException  {
        //dbConnection
        
//        PreparedStatement prestmt = DBConnection.getInstance().getConnection().prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?)");
//        prestmt.setString(1, getNewId());
//        prestmt.setString(2, txtName.getText());
//        prestmt.setString(3, txtCountry.getText());
//        prestmt.setInt(4,parseInt(txtAge.getText()) );
//        prestmt.setString(5, ((RadioButton)gender.getSelectedToggle()).getText());
//        prestmt.setString(6, txtMobileNumber.getText());
//        prestmt.setString(7, txtEmail.getText());
//        prestmt.setString(8, txtUserName.getText());
//        prestmt.setString(9, pwdPassword.getText());       
//        prestmt.execute();
//        prestmt.close();
//        System.out.println(getNewId());
        
         Parent parent=FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        Scene scene = new Scene(parent);
        Stage primaryStage  = (Stage)root.getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
        
        
//create an alert

//Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"successfully Registered");
//alert.setTitle("Confirmation alert");
//alert.setHeaderText("NOW YOU CAN START THE JOURNEY.");
//alert.setContentText("Login to your account");
//Optional<ButtonType> result = alert.showAndWait();
    }

    private String getNewId() throws SQLException, ClassNotFoundException{
        
        Statement stmt = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("select id from user order by id desc limit 1");
        rs.next();
        int oldId=parseInt(rs.getString("id"));
        String newId="00"+String.valueOf(oldId+1);
        return newId;
 
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

//        String email = txtEmail.getText();
//        Pattern patternEmail=Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
//        Matcher matcher=patternEmail.matcher(email);
//        if(matcher.find()){
//           lblEmail.setText(" ");
//           txtPassword.requestFocus();
//        }else{
//            lblEmail.setText("Invalid Entry..");
//        }
    }



    
}

    
