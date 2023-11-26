package com.pbo.exception;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
        // Input data 
        System.out.print("Masukkan No Faktur: ");
        int noFaktur = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt();
        System.out.println("--------------------------");
        // Membuat objek Transaksi 
    
        Barang transaksi = new Transaksi(noFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBeli);
        // Menampilkan informasi transaksi pembelian
        ((Transaksi) transaksi).tampilkanTransaksi(); 
    } catch (Exception e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    } finally {
        scanner.close();
    }
}
}