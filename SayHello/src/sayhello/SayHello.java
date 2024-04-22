/*
 * Nama : I Made Dharma Putra
 * NIM : 2201010506
 * Project : Hello World
 */
package sayhello;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class SayHello {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String b1,b2;
        int b3,rumus;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Nama Anda : ");
        b1 = sc.nextLine();
        
        System.out.print("Masukan NIM Anda : ");
        b2 = sc.nextLine();
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        b3 = sc.nextInt();
        
        rumus = 2024 - b3;
               
        System.out.println("Nama Saya " + b1);
        System.out.println("Dengan NIM " + b2);
        System.out.println("Tahun Kelahiran " + b3);
        System.out.println("Umur anda adalah : " + rumus );
        
        
    }
    
}
