/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.store1;
import java.util.Scanner;
/**
 *
 * @author 467
 */
public class Store1 {
    int storeID;
    String storeName;
    String storeMod;
    int numberOfEmployes;

    public static void main(String[] args) {
       System.out.println("Вариант 5, Рибо-02-21, Панкратов Максим Максимович");
       Scanner storeInfo = new Scanner(System.in);
       System.out.println("Input store ID: ");
       int myStoreID = storeInfo.nextInt();
       System.out.println("Set store mod: ");
       String myStoreMod = storeInfo.next();
       System.out.println("Input store name: ");
       String myStoreName = storeInfo.next();
       System.out.println("Input number of employes: ");
       int myNumberOfEmployes = storeInfo.nextInt();
       System.out.println("Store ID: " + myStoreID + "\n Store mod:" + myStoreMod + "\n Store Name: " + myStoreName + "\n Number of employes: " + myNumberOfEmployes);
    }
    
    public Store1(int storeID, String storeName, String storeMod, int numberOfEmployes) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.storeMod = storeMod;
        this.numberOfEmployes = numberOfEmployes;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int myStoreID) {
        this.storeID = myStoreID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String myStoreName) {
        this.storeName = myStoreName;
    }

    public String getStoreMod() {
        return storeMod;
    }

    public void setStoreMod(String myStoreMod) {
        this.storeMod = myStoreMod;
    }

    public int getNumberOfEmployes() {
        return numberOfEmployes;
    }

    public void setNumberOfEmployes(int myNumberOfEmployes) {
        this.numberOfEmployes = myNumberOfEmployes;
    }
    
    public void setStoreInformation(String myStoreName, int myNumberOfEmployes, int myStoreID, String myStoreMod) {
        storeName = myStoreName;
        numberOfEmployes = myNumberOfEmployes;
        storeID = myStoreID;
        storeMod = myStoreMod;
    }
}
