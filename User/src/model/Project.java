/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import db.DBConnection;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class Project {
    String id;
    String pName;
    String description;
    String status;

    public Project(String pName, String description, String status) {
        this.pName = pName;
        this.description = description;
        this.status = status;
    }
     private void createNewId() throws SQLException, ClassNotFoundException{
        
        Statement stmt = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("select id from user order by id desc limit 1");
        rs.next();
        int oldId=parseInt(rs.getString("id"));
        String newId="00"+String.valueOf(oldId+1);
        id=newId;
 
    }
}
