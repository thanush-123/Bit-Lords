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
public class User extends Person{
    ArrayList<Invest> investments=new ArrayList<>();
    
    public User(String name, String country, int age, String gender, String mobileNumber, String email, String userName, String password) {
        super(name, country, age, gender, mobileNumber, email, userName, password);
        
    }
    public void addInvestment(Invest investment){
        investments.add(investment);
        
    }
    
    
}
