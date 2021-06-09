/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmadafrisal;

import java.util.Scanner;

/**
 *
 * @author Asus Gc
 */
public class Kalkulator4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int pilihan;
        System.out.println("===============================");
        System.out.println("=====KALKULATOR SEDERHANA======");
        System.out.println("===============================");
        System.out.println("1. Penjumlahan  (+)");
        System.out.println("2. Pengurangan  (-)");
        System.out.println("3. Perkalian    (*)");
        System.out.println("4. Pembagian    (/)");
        System.out.println("5. Modulus      (%)");
        System.out.println("6. Pangkat      (^)");
        System.out.println("7. Faktorial    (!)");
        System.out.println("0. Exit");

        do {
            System.out.print("Masukan Pilihan : ");
            pilihan = read.nextInt();
            switch (pilihan) {
                case 0:
                    System.out.println("Keluar....");
                    break;
                case 1:
                    penjumlahan();
                    break;
                case 2:
                    pengurangan();
                    break;
                case 3:
                    perkalian();
                    break;
                case 4:
                    pembagian();
                case 5:
                    modulus();
                    break;
                case 6:
                    pangkat();
                    break;
                case 7:
                    faktorial();
                    break;
                default:
                    System.out.println("Inputan Yang anda Masukan Salah");
                    break;

            }
        } while (pilihan != 0);

    }

    private static void penjumlahan() {
        Scanner read = new Scanner(System.in);
        int bil1, bil2, hasil;
        System.out.print("Masukan Bilangan 1 : ");
        bil1 = read.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = read.nextInt();
        hasil = bil1 + bil2;
        System.out.println("Hasil Penjumlahan = " + hasil);
    }

    private static void pengurangan() {
        Scanner read = new Scanner(System.in);
        int bil1, bil2, hasil;
        System.out.print("Masukan Bilangan 1 : ");
        bil1 = read.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = read.nextInt();
        hasil = bil1 - bil2;
        System.out.println("Hasil Pengurangan = " + hasil);
    }

    private static void perkalian() {
        Scanner read = new Scanner(System.in);
        int bil1, bil2, hasil;
        System.out.print("Masukan Bilangan 1 : ");
        bil1 = read.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = read.nextInt();
        hasil = bil1 * bil2;
        System.out.println("Hasil Perkalian = " + hasil);
    }

    private static void pembagian() {
        Scanner read = new Scanner(System.in);
        double bil1, bil2;
        System.out.print("Masukan Bilangan 1 : ");
        bil1 = read.nextDouble();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = read.nextDouble();
        double hasil = bil1 / bil2;
        if (hasil % 1 == 0) {
            int hasilBagi = (int) hasil;
            System.out.println("Hasil Pembagian = " + hasilBagi);
        } else {
            System.out.println("Hasil Pembagian = " + hasil);
        }

    }

    private static void modulus() {
        Scanner read = new Scanner(System.in);
        int bil1, bil2, hasil;
        System.out.print("Masukan Bilangan 1 : ");
        bil1 = read.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = read.nextInt();
        hasil = bil1 % bil2;
        System.out.println("Hasil Modulus = "+hasil);
    }

    private static void pangkat() {
        Scanner read = new Scanner(System.in);
        int angka, pangkat, hasil, i;
        System.out.print("Masukan Angka : ");
        angka = read.nextInt();
        System.out.print("Masukan Pangkat : ");
        pangkat = read.nextInt();
        hasil = pangkat;
        if ( pangkat > 1) {
            for (i = 1; i < pangkat; i++){
                hasil *= angka;
            }
        }
        System.out.println("Hasil Perpangkatan = "+hasil);
        
    }

    private static void faktorial() {
        Scanner read = new Scanner(System.in);
        int angka, hasil, i;
        System.out.print("Masukan Angka : ");
        angka = read.nextInt();
        hasil = 1;
        if (angka < 1) {
            System.out.println("1! = 1");
        } else {
            for(i = 2; i <= angka; i++) {
                hasil *= i;
            }
        }
        System.out.println("Hasil Faktorial = "+hasil);
    }
}
