/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilangka;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class TampilAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,b1,b2;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Awal : ");
        b1 = sc.nextInt();

        System.out.print("Akhir : ");
        b2 = sc.nextInt();
        
        for (x = b1; x <= b2; x++) {
            System.out.println(x);
        }
    }

}
