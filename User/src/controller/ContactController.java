/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import tm.ContactTM;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ContactController implements Initializable {

    @FXML
    private TableView<ContactTM> contactDetails;
    @FXML
    private TableColumn<ContactTM, String> namecol;
    @FXML
    private TableColumn<ContactTM, String> phonenocol;
    @FXML
    private TableColumn<ContactTM, String> emailcol;
    @FXML
    private TableColumn<ContactTM, String> projectcol;
    @FXML
    private Label name;
    @FXML
    private TextField txtname;
    @FXML
    private Label phoneno;
    @FXML
    private TextField txtphoneno;
    @FXML
    private Label email;
    @FXML
    private TextField txtemail;
    @FXML
    private Label project;
    @FXML
    private ComboBox<?> comproject;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnEdit;
    @FXML
    private Button btnDelete;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Select(ActionEvent event) {
    }

    @FXML
    private void Add(ActionEvent event) {
    }

    @FXML
    private void Edit(ActionEvent event) {
    }

    @FXML
    private void Delete(ActionEvent event) {
    }
    
}
