package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String opsi;
        do {
            System.out.println("welcome to Palindrome code");
            System.out.print("Masukkan Sebuah Kata : ");
            String str = input.nextLine();

            boolean isPalindrome = true;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("===============================");
            if (isPalindrome) {
                System.out.println(str + " Merupakan Palindrome");
            } else {
                System.out.println(str + " Bukan Palindrome");
            }


            String reversedStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr += str.charAt(i);
            }
            System.out.println("Kata Terbalik: " + reversedStr);
            System.out.println("===============================");


            System.out.print("mau coba lagi gak nih? (y/n) : ");
            opsi = input.next();
            input.nextLine();

        }while (opsi.equalsIgnoreCase("y")) ;


        System.out.println("                    *                ");
        System.out.println("                *  Good *            ");
        System.out.println("              *    Bye    *          ");
        System.out.println("               *   See   *           ");
        System.out.println("                 * You *             ");
        System.out.println("                    *                ");

    }
}