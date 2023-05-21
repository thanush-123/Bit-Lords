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
public abstract class Person {
        private String name;
        private String country;
        private int age;
        private String gender;
        private String mobileNumber;
        private String email;
        private String userName;
        private String password;
        ArrayList<Project> projects=new ArrayList<>();

    public Person(String name, String country, int age, String gender, String mobileNumber, String email, String userName, String password) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
   
    public void addProject(Project project){
        projects.add(project);
    }
   
   
    
}
