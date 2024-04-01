/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasibilangan;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class OperasiBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float b1, b2, jml, krg, bagi, kali;
        /*
        b1 = 5;
        b2 = 3;
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilangan 1 : ");
        b1 = sc.nextFloat();

        System.out.print("Masukan Bilangan 2: ");
        b2 = sc.nextFloat();

        jml = b1 + b2;
        krg = b1 - b2;
        bagi = b1 / b2;
        kali = b1 * b2;
        System.out.println(b1 + " + " + b2 + " = " + jml);
        System.out.println(b1 + " - " + b2 + " = " + krg);
        System.out.println(b1 + " : " + b2 + " = " + String.format("%.2f", bagi));
        System.out.println(b1 + " x " + b2 + " = " + kali);

    }

}
