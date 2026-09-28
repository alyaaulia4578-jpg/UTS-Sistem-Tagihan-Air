/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI MODERN
 */

public class Meter {

    private String nomor;
    private int awal;
    private int akhir;

    public Meter(String nomor, int awal, int akhir) {
        this.nomor = nomor;
        this.awal = awal;
        this.akhir = akhir;
    }

    public int hitungPemakaian() {
        return akhir - awal;
    }

    public String getNomor() {
        return nomor;
    }

    public int getAwal() {
        return awal;
    }

    public int getAkhir() {
        return akhir;
    }
}
