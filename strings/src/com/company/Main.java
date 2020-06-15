package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] breakdown = input.split(" ");
        String longest = " ";
        for (String word: breakdown) {
            if (word.length() > longest.length()) { longest = word; }
        }
        System.out.println(longest);
    }
}
