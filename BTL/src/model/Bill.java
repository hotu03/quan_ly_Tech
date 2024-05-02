/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

public class Bill implements Serializable{
    private String billID;
    private String nameClient;
    private String phoneClient;
    private String serialMachine;
    private String requirements;
    private String statements;
    private String nameTechnician;
    private String phoneTechnician;
    private String account;
    private String note;

    public Bill(String billID, String nameClient, String phoneClient,String serialMachine, String requirements, String statements, String nameTechnician, String phoneTechnician, String account, String note) {
        this.billID = billID;
        this.nameClient = nameClient;
        this.phoneClient = phoneClient;
        this.serialMachine = serialMachine;
        this.requirements = requirements;
        this.statements = statements;
        this.nameTechnician = nameTechnician;
        this.phoneTechnician = phoneTechnician;
        this.account = account;
        this.note = note;
    }

    public String getBillID() {
        return billID;
    }

    public Bill(){
        
    }

    public String getNameClient() {
        return nameClient;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public String getRequirements() {
        return requirements;
    }

    public String getStatements() {
        return statements;
    }

    public String getNameTechnician() {
        return nameTechnician;
    }

    public String getPhoneTechnician() {
        return phoneTechnician;
    }

    public String getAccount() {
        return account;
    }

    public String getNote() {
        return note;
    }

    public String getSerialMachine() {
        return serialMachine;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void setStatements(String statements) {
        this.statements = statements;
    }

    public void setNameTechnician(String nameTechnician) {
        this.nameTechnician = nameTechnician;
    }

    public void setPhoneTechnician(String phoneTechnician) {
        this.phoneTechnician = phoneTechnician;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSerialMachine(String serialMachine) {
        this.serialMachine = serialMachine;
    }
    

}
