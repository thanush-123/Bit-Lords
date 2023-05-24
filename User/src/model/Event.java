/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Event {
    String id;
    String name;
    String description;
    String Address;
    String Date;
    Project project;

    public Event(String id, String name, String description, String Address, String Date, Project project) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.Address = Address;
        this.Date = Date;
        this.project = project;
    }
    
    
}
