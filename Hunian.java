/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */

public class Hunian extends Golongan {

    public Hunian() {
        super("Hunian", 3000);
    }

    @Override
    public int hitungTagihan(int pemakaian) {
        return pemakaian * tarif;
    }
}