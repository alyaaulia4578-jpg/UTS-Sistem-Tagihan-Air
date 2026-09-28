/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */

public class Usaha extends Golongan {

    public Usaha() {
        super("Usaha", 5000);
    }

    @Override
    public int hitungTagihan(int pemakaian) {
        return pemakaian * tarif;
    }
}
