/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.model;

/**
 *
 * @author mhdir
 */
public class Test {
    public static void main(String[] Args){
        try{
            System.out.println(Args[0]);
            System.out.println(1/0);
        }catch(Exception ex){
            System.out.println("Error"+ex.getMessage());
        }
    }
}
