
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mhdir
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double grade1, grade2, grade3, average;

        System.out.print("Enter grade 1: ");// meminta input user untuk tiga nilai ujian
        grade1 = Double.parseDouble(reader.readLine());
        System.out.print("Enter grade 2: ");
        grade2 = Double.parseDouble(reader.readLine());
        System.out.print("Enter grade 3: ");
        grade3 = Double.parseDouble(reader.readLine());

        average = (grade1 + grade2 + grade3) / 3;// menghitung rata-rata dari tiga nilai ujian

        // menampilkan hasil rata-rata
        System.out.println("Average grade is " + average);
        
        // menampilkan smiley face jika rata-rata lebih besar atau sama dengan 60
        if (average >= 60) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}

