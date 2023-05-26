/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mysql.cj.protocol.Resultset;
import db.DBConnection;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Project {
    String id;
    String pName;
    String description;
    String status;
    Admin admin;    
    ArrayList<Invest> investments=new ArrayList<>();
    
    

    public Project(String pName, String description, String status) {
        this.pName = pName;
        this.description = description;
        this.status = status;
    }
    
    public void addInvestment(Invest investment){
        investments.add(investment);
        
    }
    
    public void createNewId() throws SQLException, ClassNotFoundException{
        
        Statement stmt = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("select id from user order by id desc limit 1");
        rs.next();
        int oldId=parseInt(rs.getString("id"));
        String newId="00"+String.valueOf(oldId+1);
        id=newId;
 
    }

    public void insertProjectData(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public ArrayList<Invest> getInvestments() {
        return investments;
    }

    public void setInvestments(ArrayList<Invest> investments) {
        this.investments = investments;
    }
    
    
}
