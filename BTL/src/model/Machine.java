/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Duc Xuan
 */
public class Machine extends People implements Serializable{
    private String serial;    
    private String requirements;
    private String notes;
    private String statements;
    
    
    public Machine(){
        super();
    }

    public Machine(String name, String phone, String serial, String requirements, String statements, String notes) {
        super(name, phone);
        errorInitMachine(requirements, serial);
        this.serial = serial;
        this.requirements = requirements;
        this.notes = notes;
        this.statements = statements;   
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        try{
            if(requirements.isEmpty()){
                throw new Exception("Loi trong yeu cau");
            }
            this.requirements = requirements;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
        
        
    }

    public String getStatements() {
        return statements;
    }

    public void setStatements(String statements) {
        this.statements = statements;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        try{
            if(serial.isEmpty()){
                throw new Exception("Loi bo trong serial");
            }
            this.serial = serial;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void errorInitMachine(String requirements, String serial){
        try{
            if(requirements.isEmpty()){
                throw new Exception("Loi bo trong yeu cau");
            }
            if(serial.isEmpty()){
                throw new Exception("Loi bo trong serial");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    

    
}
