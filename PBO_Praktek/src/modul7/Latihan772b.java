/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;
import java.util.Arrays;

import javax.swing.JOptionPane;
/**
 *
 * @author mhdir
 */
public class Latihan772b {
    public static void main(String[] args){

   int[] nilai = new int[10];
   
   int i,max,imax;
   
   max = 0;
   
   imax = 0;
   
   for(i=0;i<10;i++){
   
       nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("nilai ke-"+(i+1)));
       
   }
   
   for(i=0;i<10;i++){
   
      if(nilai[i]>max){
     
          max = nilai[i];
          
          imax=i;
          
      }
      
   }
JOptionPane.showMessageDialog(null,"\n nilai yang didapatkan "+Arrays.toString(nilai)+

       "\n nilai terbesar :"+max+"\n nilai terbesar terdapat pada baris ke-"+(i));
}

}

