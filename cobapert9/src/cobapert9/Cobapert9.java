/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobapert9;

/**
 *
 * @author ACER
 */
public class Cobapert9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 12;
        int luas = LuasKubus(s);
        
        System.out.println(luas);
    }
    static int LuasPersegi(int sisi){
        return sisi * sisi;
    }
    static int LuasKubus(int sisi){
        return 6 * LuasPersegi(sisi);
    }
}
