/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm;

/**
 *
 * @author Asus
 */



import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ContactTM {
        private final  StringProperty name;
        private final  StringProperty project;
        private final StringProperty phoneno;
        private final StringProperty email;
       

    public ContactTM() {
        name = new SimpleStringProperty(this, "name");
        phoneno = new SimpleStringProperty(this, "phoneno");
        email = new SimpleStringProperty(this, "email");
        project = new SimpleStringProperty(this, "project");
       
    }
   
   public StringProperty nameProperty() { 
       return name;
   }
   public String getName() { 
       return name.get();
   }
   public void setName(String newName) { 
       name.set(newName); 
   }
   
   public StringProperty phonenoProperty() { 
       return phoneno; 
   }
   public String getPhoneno() { 
       return phoneno.get(); 
   }
   public void setPhoneno(String newPhoneno) { 
       name.set(newPhoneno); 
   }
   
   public StringProperty emailProperty() { 
       return email;
   }
   public String getEmail() { 
       return email.get(); 
   }
   public void setEmail(String newEmail) { 
       name.set(newEmail);
   }
   
   public StringProperty projectProperty() { 
       return project; 
   }
   public String getProject() { 
       return project.get(); 
   }
   public void setProject(String newProject) {
       name.set(newProject); 
   }
   
      
}
