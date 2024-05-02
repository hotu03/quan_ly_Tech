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
public class Technician extends People implements Serializable{
    
    private String studentCode;
    private String classLearn;
    private String accountName;
    private String passWord;
    
    public Technician(){
        super();
    }

    public Technician(String name, String phone, String studentCode, String classLearn, String accountName, String passWord) {
        super(name, phone);
        errorInitTech(studentCode, classLearn, accountName, passWord);
        this.studentCode = studentCode;
        this.classLearn = classLearn;
        this.accountName = accountName;
        this.passWord = passWord;
    }
    

    public void setPassWord(String passWord) {
        try{
            if(passWord.isEmpty()){
                throw new Exception("Loi bo trong password");
            }
            this.passWord = passWord;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }    
    }

    public String getPassWord() {
        return passWord;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setClassLearn(String classLearn) {
        try{
            if(classLearn.isEmpty()){
                throw new Exception("Loi bo trong lop - khoa");
            }
            this.classLearn = classLearn;
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
    }

    public String getClassLearn() {
        return classLearn;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setStudentCode(String studentCode) {
        try{
            if(studentCode.isEmpty()){
                throw new Exception("Loi bo trong password");
            }
            if(!super.isNumeric(studentCode)){
                throw new Exception("Loi ki tu trong ma sinh vien");
            }
            this.studentCode = studentCode;
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
        
    }


    public void setAccountName(String accountName) {
        
        try{
            if(accountName.isEmpty()){
                throw new Exception("Loi bo trong ten account");
            }
            
            this.accountName = accountName;
        }
        catch(Exception ex){
            ex.printStackTrace();
        } 
        
    }
    
    private void errorInitTech(String studentCode, String classLearn, String accountName, String passWord){
        try{
            if(studentCode.isEmpty()){
                throw new Exception("Loi bo trong ma sinh vien");
            }
            if(classLearn.isEmpty()){
                throw new Exception("Loi bo trong thong tin lop - khoa");
            }
            if(accountName.isEmpty()){
                throw new Exception("Loi bo trong ten account");
            }
            if(passWord.isEmpty()){
                throw new Exception("Loi bo trong password");
            }
            if(!super.isNumeric(studentCode)){
                throw new Exception("Loi ki tu trong ma sinh vien");
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


    
    
}
