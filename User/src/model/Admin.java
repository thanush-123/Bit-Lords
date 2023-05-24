/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Admin extends Person {
    ArrayList<Project> projects=new ArrayList<>();
    ArrayList<Invest> investments=new ArrayList<>();
    
    public Admin(String name, String country, int age, String gender, String mobileNumber, String email, String userName, String password) {
        super(name, country, age, gender, mobileNumber, email, userName, password);
    }
     public void addProject(Project project){
        projects.add(project);
    }
    
}
