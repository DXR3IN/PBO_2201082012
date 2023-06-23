
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
import javax.swing.JOptionPane;

public class pangkatdowhile {
    public static void main(String[] args) {
        int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka:"));
        int pangkat = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pangkat:"));

        int hasil = 1;
        int counter = 0;

        do {//statement do while loop untuk menghitung pangkat dari angka tersebut dengan mengalikan angka sebanyak pangkat-1 kali.
            //Variabel hasil awalnya diinisialisasi dengan 1, dan setiap kali perulangan dilakukan, hasil dikalikan dengan angka. 
            //Variabel counter digunakan untuk menghitung berapa kali perulangan sudah dilakukan.
            //Perulangan dilakukan selama counter kurang dari pangkat.
            hasil *= angka;
            counter++;
        } while (counter < pangkat);

        JOptionPane.showMessageDialog(null, angka + " pangkat " + pangkat + " = " + hasil);
    }
}


