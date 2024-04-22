/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasiperulangan;
import java.util.Scanner;
/**
 *
 * @author INSTIKI
 */
public class OperasiPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,b1,b2,jml,krg;
        String car;
        for(x=1;x<10;x++){
            System.out.println("Nilai X adalah "+ x);
        }
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[2]);
        
         int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]);
    }
    
}
