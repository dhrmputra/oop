/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrik;

import java.util.Scanner;
/**
 *
 * @author INSTIKI
 */
public class Matrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input matriks pertama
        System.out.println("Masukkan nilai matriks pertama :");
        int[][] matrix1 = inputMatrix(scanner);

        // Input matriks kedua
        System.out.println("Masukkan nilai matriks kedua :");
        int[][] matrix2 = inputMatrix(scanner);

        // Penjumlahan matriks
        int[][] tambah = tambahMatrix(matrix1, matrix2);

        // Perkalian matriks
        int[][] kali = kaliMatrix(matrix1, matrix2);

        // Menampilkan hasil
        System.out.println("Matriks Pertama :");
        printMatrix(matrix1);
        System.out.println("Matriks Kedua :");
        printMatrix(matrix2);
        System.out.println("Penjumlahan Matriks :");
        printMatrix(tambah);
        System.out.println("Perkalian Matriks :");
        printMatrix(kali);
    }

    // Method untuk mengambil input matriks dari pengguna
    public static int[][] inputMatrix(Scanner scanner) {
        int[][] matrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method untuk menambahkan dua matriks
    public static int[][] tambahMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] tambah = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                tambah[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return tambah;
    }

    // Method untuk mengalikan dua matriks
    public static int[][] kaliMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] kali = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                kali[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    kali[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return kali;
    }

    // Method untuk mencetak matriks
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
