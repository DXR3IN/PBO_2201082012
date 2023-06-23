/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author mhdir
 */
public class Latihan771b {
    public static void main(String[] args){

    String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
    
    System.out.println("Hari Dalam Seminggu:");
    
    int i = 0;
    
    do{
    
        if(i<=hari.length){
        
            System.out.println(hari[i]);
            
            i++;
            
        }
        
    }while(i<hari.length);
    
}
}
