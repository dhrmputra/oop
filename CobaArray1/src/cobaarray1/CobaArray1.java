/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaarray1;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class CobaArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i;
        int sum = 0;
        int avg = 0;

        for (i = 0; i < 5; i++) {
            System.out.print("Masukan Angka ke-" + i + " :");
            a[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("ANGKA YANG DI INPUT");
        System.out.println("-------------------");
        for (i = 0; i < 5; i++) {
            System.out.println("Angka ke- : " + i + " Adalah " + +a[i]);
            sum += a[i];
            avg = a[i] / 5;

        }
        int max = a[0];
        int min = a[0];
        for (i = 0; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Total : " + sum);
        System.out.println("Rata2 : " + avg);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }

}
