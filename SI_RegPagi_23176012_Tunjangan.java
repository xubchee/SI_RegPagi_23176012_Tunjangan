/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pertemuan6;

import java.util.Scanner;

/**
 *  Nama      : MOHAMMAD FAJAR SUBECHI
 *  NIM       : 23176012
 *  Prodi     : Sistem Infprmasi
 *  Deskripsi : 
 * @author ACER
 */
public class SI_RegPagi_23176012_Tunjangan {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Program Tunjangan =====");

        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = input.nextInt();

        // Input status pernikahan
        System.out.print("Masukkan status pernikahan (menikah/belum): ");
        String statusPernikahan = input.next().toUpperCase();

        // Hitung tunjangan
        double tunjangan = 0;
        if (statusPernikahan.equals("MENIKAH")) {
            tunjangan = gajiPokok * 0.40;
        }

        // Tampilkan tunjangan
        System.out.println("\n==== Hasil Perhitungan ====");
        System.out.println("Gaji pokok anda = " + gajiPokok);
        System.out.println("Tunjangan karyawan adalah Rp" + tunjangan);
        System.out.println("Total Gaji = " + (gajiPokok + tunjangan));
    }    
}
