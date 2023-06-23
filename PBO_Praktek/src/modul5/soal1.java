/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;
import java.io.*;
/**
 *
 * @author mhdir
 */
public class soal1 {
    public static void main(String[] Args){
        int i;
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String word1 = "",word2 = "",word3 = "";
        System.out.println("\nPlease input your 3 line :");
        try{
    
            word1 = dataIn.readLine();
            word2 = dataIn.readLine();
            word3 = dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Error!");
        }
        
        
        System.out.println(word1+" "+word2+" "+word3);
    }
    
}
