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
public class GardenStore extends Store {
    private int plantsNumber;
    private int waterQuantity;
    private int soilQuantity;
    private String todaysLeaflet;

    public GardenStore(int storeSquare, int storeID, String storeWorkMode, String storeName) {
        super(storeSquare, storeID, storeWorkMode, storeName);
    }  

    public GardenStore() {
    }
    

    public GardenStore(int plantsNumber, int waterQuantity, int soilQuantity, String todaysLeaflet, int storeSquare, int storeID, String storeWorkMode, String storeName) {
        super(storeSquare, storeID, storeWorkMode, storeName);
        this.plantsNumber = plantsNumber;
        this.waterQuantity = waterQuantity;
        this.soilQuantity = soilQuantity;
        this.todaysLeaflet = todaysLeaflet;
    }

    public int getPlantsNumber() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("Input number of plants you have: ");
        return this.plantsNumber = storeInfo.nextInt();
    }

    public int getWaterQuantity() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("Input the data about water you have: ");
        return this.waterQuantity = storeInfo.nextInt();
    }

    public int getSoilQuantity() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("Input the data about soil you have: ");
        return this.soilQuantity = storeInfo.nextInt();
    }

    public String getTodaysLeaflet() {
        Scanner storeInfo = new Scanner (System.in);
        System.out.println("Today's slogan will be: ");
        return this.todaysLeaflet = storeInfo.next();
    }

    @Override
    public String toString() {
        String str = "Your number of plants: " + getPlantsNumber() + ", Your store's slogan: " + getTodaysLeaflet() + ", Water remains: " + getWaterQuantity()
                + ", Soil remains: " + getSoilQuantity();
        return str;
    }
    
    public void cleanFloorFromSoil(){
        System.out.println("Clean all the place");
    }
    
    public void sortPlants(){
        System.out.println("Place all the plants on the shelf");
    }
    
    public void plantsFeed(){
        System.out.println("Water the plants");
    }
}
