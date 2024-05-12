/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utsmatriks;
import java.util.Scanner;

/**
 *
 * @author Mayada
 */
public class utsmatriks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriksA = bacaMatriks(input, "A");
        int[][] matriksB = bacaMatriks(input, "B");

        System.out.println("\nMatriks A:");
        cetakMatriks(matriksA);
        System.out.println("\nMatriks B:");
        cetakMatriks(matriksB);

        int[][] hasilPenjumlahan = operasiMatriks(matriksA, matriksB, '+');
        System.out.println("\nHasil Penjumlahan Matriks:");
        cetakMatriks(hasilPenjumlahan);

        int[][] hasilPerkalian = operasiMatriks(matriksA, matriksB, '*');
        System.out.println("\nHasil Perkalian Matriks:");
        cetakMatriks(hasilPerkalian);
    }

    public static int[][] bacaMatriks(Scanner input, String namaMatriks) {
        int[][] matriks = new int[2][2];
        System.out.println("Masukkan nilai untuk Matriks " + namaMatriks + ":");
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print("Masukan Angka Matriks" + namaMatriks + " ke-[" + baris + "][" + kolom + "]: ");
                matriks[baris][kolom] = input.nextInt();
            }
        }
        return matriks;
    }

    public static int[][] operasiMatriks(int[][] matriksA, int[][] matriksB, char operator) {
        int[][] hasil = new int[2][2];
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                if (operator == '+') {
                    hasil[baris][kolom] = matriksA[baris][kolom] + matriksB[baris][kolom];
                } else if (operator == '*') {
                    hasil[baris][kolom] = 0;
                    for (int k = 0; k < 2; k++) {
                        hasil[baris][kolom] += matriksA[baris][k] * matriksB[k][kolom];
                    }
                }
            }
        }
        return hasil;
    }

    public static void cetakMatriks(int[][] matriks) {
        for (int baris = 0; baris < 2; baris++) {
            for (int kolom = 0; kolom < 2; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println();
        }
    }
}