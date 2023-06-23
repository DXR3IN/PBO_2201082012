/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;
import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

import java.util.Arrays;

import java.util.logging.Level;

import java.util.logging.Logger;
/**
 *
 * @author mhdir
 */
public class Latihan772a {
    public static void main(String[] args){

        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    
        int[] nilai = new int[10];

        int i,max,imax;

        max =0;

        imax = 0;

        System.out.println("== Masukan Nilai ==");

               try {

                    for(i=0;i<10; i++){

                   System.out.print("masukan nilai ke-"+(i+1)+" =");

                   nilai[i] = Integer.parseInt(data.readLine());    

                   }

                    //for(i=0;i<10;i++){

                    //System.out.println("array yang diinputkan:"+nilai[i]);

                    //}

                 for(i=0;i<10;i++){


                 if(nilai[i]>max){

                         max = nilai[i];

                         imax = i;

                     }

                 }   

                 System.out.println("== Hasil Data Nilai ==");

                 System.out.println("array yang diinputkan:"+Arrays.toString(nilai));

                 System.out.println("nilai terbesar adalah: "+max);

                 System.out.println("nilai terbesar ada pada baris ke: "+(imax+1));

            }

               catch (IOException ex) {

                   Logger.getLogger(Latihan772a.class.getName()).log(Level.SEVERE, null, ex);

        }
 
    }
}
