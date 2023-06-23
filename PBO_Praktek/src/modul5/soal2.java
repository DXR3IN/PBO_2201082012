/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;
import javax.swing.JOptionPane;
/**
 *
 * @author mhdir
 */
public class soal2 {
    public static void main(String[] Args){
        String word1 = "",word2 = "",word3 = "";
        word1 = JOptionPane.showInputDialog("Masukkan kata-kata pertama : ");
        word2 = JOptionPane.showInputDialog("Masukkan kata-kata kedua : ");
        word3 = JOptionPane.showInputDialog("Masukkan kata-kata ketiga : ");
        
        String message = word1+" "+word2+" "+word3;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
