/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author Asus
 */
public class Invest {
    private Project project;
    private Person person;
    private LocalDateTime dateTime;

    public Invest(Project project, Person person) {
        this.project = project;
        this.person = person;
        dateTime=LocalDateTime.now();
    }
    
}
