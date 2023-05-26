/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tm;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ProjectTM {
    private SimpleStringProperty projectId = new SimpleStringProperty("");
    private SimpleStringProperty projectName = new SimpleStringProperty("");
    private SimpleStringProperty projectDescription = new SimpleStringProperty("");
    private SimpleStringProperty projectStatus = new SimpleStringProperty("");
         
    public ProjectTM(String projectId, String projectName, String projectDescription,String status) {
        this.projectId.set(projectId);
        this.projectName.set(projectName);
        this.projectDescription.set(projectDescription);
        this.projectStatus.set(status);

    }
    
    public ProjectTM() {
    
    }

    public SimpleStringProperty getProjectStatus() {
        return projectStatus;
    }

    public void setStatus(SimpleStringProperty status) {
        this.projectStatus = status;
    }
    

    public String getProjectId() {
        return projectId.get();
    }

    public SimpleStringProperty projectIdProperty() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId.set(projectId);
    }

    public String getProjectName() {
        return projectName.get();
    }

    public SimpleStringProperty projectNameProperty() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName.set(projectName);
    }

    public String getProjectDescription() {
        return projectDescription.get();
    }

    public SimpleStringProperty projectDescriptionProperty() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription.set(projectDescription);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName=" + projectName +
                ", projectDescription=" + projectDescription +
                '}';
    }
}