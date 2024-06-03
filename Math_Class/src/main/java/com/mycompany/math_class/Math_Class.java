/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.math_class;

/**
 *
 * @author INSTIKI
 */
public class Math_Class {

    public static void main(String[] args) {
        jumlah(8,7);
        kurang(8,7);
        kali(8,7);
        bagi(8,7);
        

    }

    public static void jumlah(int b1, int b2) {
        int hasil;
        hasil = b1 + b2;
        System.out.println(hasil);
    }
     public static void kurang(int b1, int b2) {
        int hasil;
        hasil = b1 - b2;
        System.out.println(hasil);
    }
      public static void kali(int b1, int b2) {
        int hasil;
        hasil = b1 * b2;
        System.out.println(hasil);
    }
       public static void bagi(int b1, int b2) {
        int hasil;
        hasil = b1 / b2;
        System.out.println(hasil);
    }
}
