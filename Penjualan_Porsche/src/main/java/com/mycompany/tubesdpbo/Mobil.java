/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesdpbo;

/**
 *
 * @author Muhammad Ikhsan
 */
import java.text.NumberFormat;
import java.util.Locale;

public class Mobil {
    private String nama;
    private String tipe;
    private double harga;
    private Pelanggan pembeli;

    // Constructor
    public Mobil(String nama, String tipe, double harga) {
        this.nama = nama;
        this.tipe = tipe;
        this.harga = harga;
        this.pembeli = null; // Belum ada pembeli
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public Pelanggan getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pelanggan pembeli) {
        this.pembeli = pembeli;
    }

    // Metode untuk menampilkan informasi mobil
    public void tampilInfo() {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    System.out.println("Nama Mobil: " + nama);
    System.out.println("Tipe Mobil: " + tipe);
    System.out.println("Harga Mobil: " + currencyFormat.format(harga));
    if (pembeli != null) {
        System.out.println("Pembeli: " + pembeli.getNama());
    } else {
        System.out.println("Mobil belum dibeli.");
        }
    }
}
