
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
import javax.swing.JOptionPane;

public class pangkatwhileloop {
    public static void main(String[] args) {
        int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka: "));
        int pangkat = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pangkat: "));
        //Menginisialisasi variabel hasil dengan nilai 1.
        int hasil = 1;
        // Menginisialisasi variabel i dengan nilai 1.
        int i = 0;
        //Memulai loop while dengan kondisi i <= pangkat. Loop akan terus berjalan selama kondisi terpenuhi.
        while (i < pangkat) {
        //Mengalikan hasil dengan angka dan menyimpan hasilnya pada variabel hasil.
            hasil *= angka;
            //Menambahkan nilai i dengan 1 setiap kali loop berjalan.
            i++;
        }
        //Menampilkan hasil perhitungan.
        JOptionPane.showMessageDialog(null, "Hasil dari " + angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}

