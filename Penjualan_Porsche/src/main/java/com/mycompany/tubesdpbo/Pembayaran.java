/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesdpbo;

/**
 *
 * @author Muhammad Ikhsan
 */
import java.util.Date;
public class Pembayaran {
    private String metode;
    private double jumlah;
    private Date tanggal;

    // Constructor
    public Pembayaran(String metode, double jumlah, Date tanggal) {
        this.metode = metode;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    // Getter dan Setter
    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    // Metode untuk menampilkan informasi pembayaran
    public void tampilInfo() {
        System.out.println("Metode Pembayaran: " + metode);
        System.out.println("Jumlah Pembayaran: " + jumlah);
        System.out.println("Tanggal Pembayaran: " + tanggal);
    }
}
