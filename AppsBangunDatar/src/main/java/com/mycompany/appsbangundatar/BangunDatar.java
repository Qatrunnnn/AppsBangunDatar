/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appsbangundatar;

/**
 *
 * @author user
 */
abstract class BangunDatar {

    private String BangunDatar;

    public BangunDatar() {
    }

    public BangunDatar(String BangunDatar) {
        this.BangunDatar = BangunDatar;
    }

    public String getBangunDatar() {
        return BangunDatar;
    }

    public void setBangunDatar(String BangunDatar) {
        this.BangunDatar = BangunDatar;
    }
    /*method untuk menghitung luas bangun datar */
    abstract double luas();
    abstract double keliling();
    
}

