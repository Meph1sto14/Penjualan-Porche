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
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        // Tambahkan beberapa mobil ke daftar
        daftarMobil.add(new Mobil("Porsche 911 Carrera S", "Coupe", 4350000000L));
        daftarMobil.add(new Mobil("Porsche 718 Boxster GTS PDK", "Coupe", 1950000000));
        daftarMobil.add(new Mobil("Porsche Panamera Turbo S PDK", "Coupe", 3750000000L));
        daftarMobil.add(new Mobil("Porsche Macan", "SUV", 2100000000));

        Pelanggan pelanggan1 = null;
        Pembayaran pembayaran1 = null;

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Pembelian Mobil");
            System.out.println("2. Tampilkan Informasi Mobil yang Sudah Dibeli");
            System.out.println("3. Tampilkan Informasi Mobil yang Belum Dibeli");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Pembelian Mobil ===");
                    System.out.println("Daftar Mobil:");
                    for (int i = 0; i < daftarMobil.size(); i++) {
                    Mobil mobil = daftarMobil.get(i);
                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
                    System.out.println((i + 1) + ". " + mobil.getNama() + " - " + mobil.getTipe() + " - " + currencyFormat.format(mobil.getHarga()));
                    }

                    System.out.print("Pilih nomor mobil yang ingin dibeli: ");
                    int nomorMobil = scanner.nextInt();
                    scanner.nextLine();

                    if (nomorMobil < 1 || nomorMobil > daftarMobil.size()) {
                        System.out.println("Pilihan tidak valid.");
                        break;
                    }

                    Mobil mobilDipilih = daftarMobil.get(nomorMobil - 1);

                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan alamat pelanggan: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon pelanggan: ");
                    String telepon = scanner.nextLine();

                    pelanggan1 = new Pelanggan(nama, alamat, telepon);
                    mobilDipilih.setPembeli(pelanggan1);

                    String metode;
                    while (true) {
                        System.out.print("Masukkan metode pembayaran (Cash/Debit): ");
                        metode = scanner.nextLine();
                        if (metode.equalsIgnoreCase("Cash") || metode.equalsIgnoreCase("Debit")) {
                            break;
                        } else {
                            System.out.println("Metode pembayaran tidak valid. Silakan pilih Cash atau Debit.");
                        }
                    }

                    pembayaran1 = new Pembayaran(metode, mobilDipilih.getHarga(), new Date());

                    System.out.println("\nPembelian berhasil!");
                    break;

                case 2:
                    System.out.println("\n=== Informasi Mobil yang Sudah Dibeli ===");
                    for (Mobil mobil : daftarMobil) {
                        if (mobil.getPembeli() != null) {
                            mobil.tampilInfo();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== Informasi Mobil yang Belum Dibeli ===");
                    for (Mobil mobil : daftarMobil) {
                        if (mobil.getPembeli() == null) {
                            mobil.tampilInfo();
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nTerima kasih telah menggunakan aplikasi ini.");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nOpsi tidak valid. Silakan pilih lagi.");
            }
        }
    }

}
