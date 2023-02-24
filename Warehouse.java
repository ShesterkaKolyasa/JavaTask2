/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.store1;

/**
 *
 * @author 467
 */
public class Warehouse extends Store1 {
    private String warehouseName;
    private int warehouseAreaSquare;
    private int warehouseID;

    public Warehouse(int storeID, String storeName, String storeMod, int numberOfEmployes) {
        super(storeID, storeName, storeMod, numberOfEmployes);
        this.warehouseAreaSquare = warehouseAreaSquare;
        this.warehouseID = warehouseID;
        this.warehouseName = warehouseName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getWarehouseAreaSquare() {
        return warehouseAreaSquare;
    }

    public void setWarehouseAreaSquare(int warehouseAreaSquare) {
        this.warehouseAreaSquare = warehouseAreaSquare;
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }
}
