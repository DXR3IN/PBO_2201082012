
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andreferdinan
 */
import java.util.Scanner;

public class membacaangka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        int number = scanner.nextInt();

        String word;

        if (number == 1) { //statement if else 
            word = "one";
        } else if (number == 2) {//statments
            word = "two";
        } else if (number == 3) {
            word = "three";
        } else if (number == 4) {
            word = "four";
        } else if (number == 5) {
            word = "five";
        } else if (number == 6) {
            word = "six";
        } else if (number == 7) {
            word = "seven";
        } else if (number == 8) {
            word = "eight";
        } else if (number == 9) {
            word = "nine";
        } else if (number == 10) {
            word = "ten";
        } else {
            word = "Invalid number";//output jika nilai yang dimasukkan salah
        }

        System.out.println(word);//output
    }
}

