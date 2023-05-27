/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import db.DBConnection;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ProjectInsertController implements Initializable {

    @FXML
    private TextField txtProjectID;
    @FXML
    private TextField txtProjectName;
    @FXML
    private TextArea txtProjectDescription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnAddProjectOnAction(MouseEvent event) {
  
        try {
          PreparedStatement prestmt = DBConnection.getInstance().getConnection().prepareStatement("insert into Project(Pname,Pdescription,status) values(?,?,?)");
//        prestmt.setString(1, getNewId());
          prestmt.setString(1, txtProjectName.getText());
          prestmt.setString(2, txtProjectDescription.getText());
          prestmt.setString(3,"statustest" );
//        prestmt.setString(4, ((RadioButton)gender.getSelectedToggle()).getText());
//        prestmt.setString(5, txtMobileNumber.getText());
//        prestmt.setString(6, txtEmail.getText());
//        prestmt.setString(7, txtUserName.getText());
//        prestmt.setString(8, pwdPassword.getText());       
        prestmt.execute();
        prestmt.close();
//        System.out.println(getNewId());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProjectInsertController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProjectInsertController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
