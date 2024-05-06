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
        System.out.println("Masukkan elemen-elemen matriks pertama (2x2):");
        int[][] matrix1 = inputMatrix(scanner);

        // Input matriks kedua
        System.out.println("Masukkan elemen-elemen matriks kedua (2x2):");
        int[][] matrix2 = inputMatrix(scanner);

        // Penjumlahan matriks
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Perkalian matriks
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);

        // Menampilkan hasil
        System.out.println("Matriks Pertama:");
        printMatrix(matrix1);
        System.out.println("Matriks Kedua:");
        printMatrix(matrix2);
        System.out.println("Penjumlahan Matriks:");
        printMatrix(sumMatrix);
        System.out.println("Perkalian Matriks:");
        printMatrix(productMatrix);
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
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    // Method untuk mengalikan dua matriks
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] productMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return productMatrix;
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
