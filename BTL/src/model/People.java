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
public class People implements Serializable{
    private String name;
    private String phone;

    public People(String name, String phone) {
        errorInit(name, phone);
        this.name = name;
        this.phone = phone;
    }
    
    public People(){
        
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void errorInit(String name, String phone){
        try{
            if(name.isEmpty()){
                throw new Exception("Loi bo trong ten");
            }
            if(phone.isEmpty()){
                throw new Exception("Loi bo trong so dien thoai");
            }
            if(!isNumeric(phone)){
                throw new Exception("Loi ki tu trong so dien thoai");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    public void errorName(String name){
        try{
            if(name.isEmpty()){
                throw new Exception("Loi bo trong ten");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void errorPhone(String phone){
        try{
            if(phone.isEmpty()){
                throw new Exception("Loi bo trong so dien thoai");
            }
            if(!isNumeric(phone)){
                throw new Exception("Loi ki tu trong so dien thoai");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public boolean isNumeric(String str) {
        // Sử dụng biểu thức chính quy để kiểm tra chuỗi có chứa toàn số không
        return str.matches("\\d+");
    }
    
 
    
}
