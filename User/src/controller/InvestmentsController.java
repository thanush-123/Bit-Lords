package controller;

import tm.InvestmentTM;
import tm.InvestmentTM;
import db.DBConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class InvestmentsController implements Initializable {

    @FXML
    private TableView<InvestmentTM> tableView;
    
    @FXML
    private TableColumn<InvestmentTM, String> unitPriceCol;

    @FXML
    private Button btnRefresh;

    @FXML
    private TableColumn<InvestmentTM, String> idCol;

    @FXML
    private TableColumn<InvestmentTM, String> pidCol;

  //  @FXML
   // private TableColumn<Investment, String> pnameCol;

    @FXML
    private TableColumn<InvestmentTM, String> totCol;

    @FXML
    void refreshTable(ActionEvent event) {

    }
    
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
        idCol.setCellValueFactory(new PropertyValueFactory<>("ID/Name"));
        pidCol.setCellValueFactory(new PropertyValueFactory<>("Project ID"));
        //pnameCol.setCellValueFactory(new PropertyValueFactory<>("Project Name"));
        unitPriceCol.setCellValueFactory(new PropertyValueFactory<>("Unit Price"));
        totCol.setCellValueFactory(new PropertyValueFactory<>("Total"));
        
        
        
        
        
    }
    
    @FXML
    void refreshTable() {
        String username = "12345";
        PreparedStatement prestmt2 = null;
        try{
            Connection conn = DBConnection.getInstance().getConnection();
            prestmt2 = conn.prepareStatement("SELECT * FROM invest WHERE userid = ?");
            prestmt2.setString(1,username);
            ResultSet rest3 = prestmt2.executeQuery();
            
            rest3.next();
            String id = rest3.getString("userid");
            String pId = (rest3.getString("projectid"));
            String uprice =(rest3.getString("unit price"));
            String investments = (rest3.getString("units invested"));
            
        
            InvestmentTM invest = new InvestmentTM();
            invest.setId(id);
            invest.setTotal( investments);
            invest.setUnitPrice(uprice);
            invest.setpId(pId);
            
            tableView.getItems().add(invest);
        }catch(ClassNotFoundException |SQLException e){
                e.printStackTrace();
            }
    }


}

