package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int num = scanner.nextInt();
        if (num > word.length()) { System.out.println(word); }
        else {
            String word2 = word.substring(0,num);
            word = word.substring(num);
            word += word2;
            System.out.println(word);
        }
    }
}
