/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreferdinan090323;

/**
 *
 * @author LAB-MM
 */
public class TestAND {
    public static void main(String[] args){
       
        int i = 0;
        int j = 10;
        boolean test= false;
        
        //demontrasi && kalau salah satu false maka yang kedua tidak di cari
        test = (i>10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demontrasi & mancari kedua niali walapun salah satu false
        test = (i>10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }   
}
