package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Username  : ");
        String username = input.nextLine();
        System.out.println("Input Jumlah followers : ");
        int followers = input.nextInt();
        System.out.println("Input Jumlah following : ");
        int following = input.nextInt();
        boolean isActive = true;
        Instagram user1 = new Instagram(username, followers, following, isActive);
        user1.tambahFollowers("1000");
        System.out.println("Followers :" + user1.Followers);
        System.out.println(user1);
    }
}