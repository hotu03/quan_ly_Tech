/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import controller.MyController;
import controller.controller;

/**
 *
 * @author Duc Xuan
 */
public class main {

    static ArrayList<Technician> listTech = new ArrayList<Technician>();
    static ArrayList<Machine> listMachine = new ArrayList<Machine>();
    static ArrayList<Bill> listBill = new ArrayList<Bill>();
    static MyController controller = new MyController();

    static void insertTechnician() {
        Technician t1 = new Technician("Ho Nam Tu", "039190591", "2021605437", "KHMT1-K16", "tuhn", "123");
        Technician t2 = new Technician("Nguyen Van An", "039190191", "20211949", "KHMT1-K16", "annv", "123");
        Technician t3 = new Technician("Nguyen Van Sinh", "039194591", "202291884", "KHMT1-K16", "sinhnv", "123");
        Technician t4 = new Technician("Dinh Van Chinh", "0391130591", "2021605917", "KHMT1-K16", "chinhdv", "123");
        listTech.add(t1);
        listTech.add(t2);
        listTech.add(t3);
        listTech.add(t4);
        controller.writeToFile(listTech, "src/file/technician.txt");
        List<Technician> loaded = controller.readDataFromFile("src/file/technician.txt");

        for (Technician i : loaded) {
            System.out.println(i.getPassWord());
        }
    }

    static void insertMachine() {
        Machine m1 = new Machine("Nguyen Van An", "03269551", "LNV123", "Sua may", "Chưa nhận", null);
        Machine m2 = new Machine("Mai Cong Sao", "03249577","DEL423", "Ve sinh may", "Chưa nhận", null);
        Machine m3 = new Machine("Dinh Van Sang", "03269552", "HP231", "Cai win", "Chưa nhận", null);

        listMachine.add(m1);
        listMachine.add(m2);
        listMachine.add(m3);
        controller.writeToFile(listMachine, "src/file/machine.txt");
        List<Machine> loaded = controller.readDataFromFile("src/file/machine.txt");

        for (Machine i : loaded) {
            System.out.println(i.getName());
        }
    }

    static void insertBill() {
    
        controller.writeToFile(listBill, "src/file/bill.txt");

    }

    public static void main(String args[]) {
        insertTechnician();
        insertMachine();
        insertBill();
    }

}
