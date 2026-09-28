/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */
public class Golongan {
    
    protected String nama;
    protected int tarif;

    public Golongan(String nama, int tarif) {
        this.nama = nama;
        this.tarif = tarif;
    }

    public String getNama() {
        return nama;
    }

    public int getTarif() {
        return tarif;
    }

    public int hitungTagihan(int pemakaian) {
        return pemakaian * tarif;
    }
}
