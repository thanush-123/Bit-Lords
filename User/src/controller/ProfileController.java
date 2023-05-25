package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
import db.DBConnection;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Person;

/**
 * FXML Controller class
 *
 * @author nuvin
 */
public class ProfileController implements Initializable {
    
    @FXML
    private Button btnUpdate;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAge;
    @FXML
    private TextField txtMobile;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtGender;
    @FXML
    private TextField txtCountry;
    
    @FXML
    private void btnUpdatePersonOnAction(ActionEvent event) throws ClassNotFoundException, SQLException, IOException  {
        
        String sql = "UPDATE person SET username = '"
                + txtUsername.getText() + "', name = '"
                + txtName.getText() + "', country = '"
                + txtCountry.getText() + "', age = '"
                + txtAge.getText() + "', gender = '"
                + txtGender.getText() + "', mobileNo = '"
                + txtMobile.getText() + "', email = '"
                + txtEmail.getText() + "' WHERE id = '11123'";
        
        try {
            Alert alert;
            if (txtUsername.getText().isEmpty()
                    || txtName.getText().isEmpty()
                    || txtCountry.getText().isEmpty()
                    || txtAge.getText().isEmpty()
                    || txtGender.getText().isEmpty()
                    || txtMobile.getText().isEmpty()
                    || txtEmail.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Cofirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to do changes?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    Statement statement = DBConnection.getInstance().getConnection().createStatement();
                    statement.execute(sql);
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public void getProfileData() {
        
        String sql = "SELECT name, country, age, gender, mobileNo, email, username FROM person WHERE id = '11123'";
        
        try {
            Statement statement = DBConnection.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            
            while (resultSet.next()) {
                txtName.setText(resultSet.getString("name"));
                txtCountry.setText(resultSet.getString("country"));
                txtAge.setText(resultSet.getString("age"));
                txtGender.setText(resultSet.getString("gender"));
                txtMobile.setText(resultSet.getString("mobileNo"));
                txtEmail.setText(resultSet.getString("email"));
                txtUsername.setText(resultSet.getString("username"));
                        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        getProfileData();
    } 
    
}
