/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework_2;
import java.util.Scanner;

/**
 *
 * @author 467
 */
public class HomeWork_2 {

    public static void main(String[] args) {
        System.out.println("Вариант №5, РИБО-02-21, Панкратов Максим Максимович");
        Store myStore = new Store();
        myStore.setStoreID();
        myStore.setStoreName();
        myStore.setStoreSquare();
        myStore.setStoreWorkMode();
        System.out.println(myStore.toString());
        GardenStore myGardenStore = new GardenStore();
        System.out.println(myGardenStore.toString());
    }
}
