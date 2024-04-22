/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, b1, b2, hasil, i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Perkalian  : ");
        x = sc.nextInt();

        System.out.print("Awal : ");
        b1 = sc.nextInt();

        System.out.print("Akhir : ");
        b2 = sc.nextInt();

        for (i = b1; i <= b2; i++) { {
                    hasil = x * i;
                System.out.println(x + " X " + i + " = " + hasil);
            }
        }
    }

}
