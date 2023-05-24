package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
import db.DBConnection;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author nuvin
 */
public class ProfileController implements Initializable {

    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtFirstname;
    @FXML
    private TextField txtLastname;
    @FXML
    private TextField txtAge;
    @FXML
    private TextField txtMobile;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtStreet1;
    @FXML
    private TextField txtStreet2;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtCountry;
    @FXML
    private TextField txtPostalcode;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    /*
    private void getUserDetails(int userId) throws ClassNotFoundException, SQLException {
    PreparedStatement preparedStatement = DBConnection.getInstance().getConnection()
            .prepareStatement("SELECT * FROM person WHERE id = 11123");
    preparedStatement.setInt(1, userId);
    ResultSet rs = preparedStatement.executeQuery();

    if (rs.next()) {
        int id = rs.getInt("id");
        String username = rs.getString("username");
        String firstname = rs.getString("firstname");
        String lastname = rs.getString("lastname");
        int age = rs.getInt("age");
        String mobile = rs.getString("mobile");
        String email = rs.getString("email");
        String street1 = rs.getString("street1");
        String street2 = rs.getString("street2");
        String city = rs.getString("city");
        String country = rs.getString("country");
        String postalcode = rs.getString("postalcode");

        txtUsername.setText(username);
        txtFirstname.setText(firstname);
        txtLastname.setText(lastname);
        txtAge.setText(String.valueOf(age));
        txtMobile.setText(mobile);
        txtEmail.setText(email);
        txtStreet1.setText(street1);
    } else {
        // Handle case when user with given ID is not found
        // For example, display an error message or clear the fields
    }
}
*/
    
}
