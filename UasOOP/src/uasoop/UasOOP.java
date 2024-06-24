/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasoop;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class UasOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================");
            System.out.println("Pilih operasi matematika:");
            System.out.println("=========================");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Pangkat");
            System.out.println("6. Faktorial");
            System.out.println("7. Logaritma (basis 10)");
            System.out.println("8. FPB (Faktor Persekutuan Terbesar)");
            System.out.println("9. KPK (Kelipatan Persekutuan Terkecil)");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: " + "\n");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambah();
                    break;
                case 2:
                    kurang();
                    break;
                case 3:
                    kali();
                    break;
                case 4:
                    bagi();
                    break;
                case 5:
                    pangkat();
                    break;
                case 6:
                    faktorial();
                    break;
                case 7:
                    logaritma();
                    break;
                case 8:
                    fpb();
                    break;
                case 9:
                    kpk();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
            System.out.println(); // Spasi antara setiap operasi
        } while (choice != 0);

        scanner.close();
    }

    public static void tambah() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        double hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    public static void kurang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        double hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    public static void kali() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        double hasil = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasil);
    }

    public static void bagi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        if (angka2 == 0) {
            System.out.println("Error: Pembagian dengan nol tidak bisa dilakukan.");
        } else {
            double hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasil);
        }
    }

    public static void pangkat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan basis: ");
        double basis = scanner.nextDouble();
        System.out.print("Masukkan eksponen: ");
        double eksponen = scanner.nextDouble();
        double hasil = Math.pow(basis, eksponen);
        System.out.println("Hasil pangkat: " + hasil);
    }

    public static void faktorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan untuk dihitung faktorialnya: ");
        int bilangan = scanner.nextInt();
        int hasil = 1;
        for (int i = 2; i <= bilangan; i++) {
            hasil *= i;
        }
        System.out.println("Hasil faktorial: " + hasil);
    }

    public static void logaritma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dihitung logaritmanya (basis 10): ");
        double angka = scanner.nextDouble();
        double hasil = Math.log10(angka);
        System.out.println("Hasil logaritma (basis 10): " + hasil);
    }

    public static void fpb() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        int fpb = hitungFPB(angka1, angka2);
        System.out.println("FPB dari " + angka1 + " dan " + angka2 + " adalah: " + fpb);
    }

    public static void kpk() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        int kpk = (angka1 * angka2) / hitungFPB(angka1, angka2);
        System.out.println("KPK dari " + angka1 + " dan " + angka2 + " adalah: " + kpk);
    }

    public static int hitungFPB(int angka1, int angka2) {
        while (angka2 != 0) {
            int temp = angka2;
            angka2 = angka1 % angka2;
            angka1 = temp;
        }
        return angka1;
    }
}
