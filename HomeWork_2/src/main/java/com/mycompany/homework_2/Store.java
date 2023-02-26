/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_2;
import java.util.Scanner;

/**
 *
 * @author 467
 */
public class Store {
    private int storeSquare;
    private int storeID;
    private String storeWorkMode;
    private String storeName;

    public Store(int storeSquare, int storeID, String storeWorkMode, String storeName) {
        this.storeSquare = storeSquare;
        this.storeID = storeID;
        this.storeWorkMode = storeWorkMode;
        this.storeName = storeName;
    }

    public Store() {
    }

    public void setStoreSquare() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store area: ");
        this.storeSquare = storeInfo.nextInt();
    }

    //public int getStoreID() {
        //Scanner storeInfo = new Scanner (System.in);
        //System.out.println("input your Store ID :");
       // return storeID = storeInfo.nextInt();
    //}

    public void setStoreID() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store ID: ");
        this.storeID = storeInfo.nextInt();
    }

    public String getStoreWorkMode() {
        return storeWorkMode;
    }

    public void setStoreWorkMode() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store Condition: ");
        this.storeWorkMode = storeInfo.next();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("input your Store Name: ");
        this.storeName = storeInfo.next();
    }
    
    public void hireEmployees(){
        Scanner storeInfo = new Scanner (System.in);
        int pplNumber = storeInfo.nextInt();
        System.out.println("Hire" + pplNumber + "new workers");
    }

    @Override
    public String toString() {
        return "Store{" + "Your store area is: " + storeSquare + ", Your store ID is: " + storeID + ", Your store WorkMode is: " 
                + storeWorkMode + ", Wellcome to the " + storeName + " Store" + "}";
    }
    
    public void open(){
        System.out.println("The store is open");
    }
    
    public void close(){
        System.out.println("The store is closed");
    }
}
