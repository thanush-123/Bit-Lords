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
        private String id;
        private String name;
        private String country;
        private int age;
        private String gender;
        private String mobileNumber;
        private String email;
        private String userName;
        private String password;
        
    public Person(){
        
    }
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", country=" + country + ", age=" + age + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", email=" + email + ", userName=" + userName + ", password=" + password + '}';
    }
   
   
   
   
    
}
