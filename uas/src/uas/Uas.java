/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author ACER
 */
public class Uas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Jumlah: " + jumlah(a, b));
        System.out.println("Kurang: " + kurang(a, b));
        System.out.println("Kali: " + kali(a, b));
        System.out.println("Bagi: " + bagi(a, b));
        System.out.println("Pangkat: " + pangkat(a, b));
        System.out.println("Faktorial dari " + a + ": " + faktorial(a));
    }
    
    // Fungsi untuk menjumlahkan dua bilangan
    public static int jumlah(int a, int b) {
        return a + b;
    }

    // Fungsi untuk mengurangkan dua bilangan
    public static int kurang(int a, int b) {
        return a - b;
    }

    // Fungsi untuk mengalikan dua bilangan
    public static int kali(int a, int b) {
        return a * b;
    }

    // Fungsi untuk membagi dua bilangan
    public static double bagi(int a, int b) {
        return (double) a / b;
    }

    // Fungsi untuk menghitung pangkat
    public static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Fungsi untuk menghitung faktorial
    public static int faktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
