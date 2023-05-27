package tm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hewaw
 */
public class InvestmentTM{
    String id;
    String projectId;
    String pName;
    String unitPrice;
    String total;

    public InvestmentTM() {
    }

    
    
    public InvestmentTM(String id, String projectId, String pName, String unitPrice, String total) {
        this.id = id;
        this.projectId = projectId;
        this.pName = pName;
        this.unitPrice = unitPrice;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return projectId;
    }

    public void setpId(String pId) {
        this.projectId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}