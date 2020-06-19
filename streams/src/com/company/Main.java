package com.company;
import java.io.*;
import java.lang.Throwable;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        RuntimeException exception = new RuntimeException("Something's bad.");
        throw exception;
        boolean nonZero = true;
        Scanner scanner = new Scanner(System.in);
        while (nonZero) {
            String x = "";
            x = scanner.nextLine();
            if (x.equals("0")){ nonZero = false; }
            else {
                try {
                    int holder = Integer.parseInt(x);
                    System.out.println(holder * 10);
                } catch (Exception e) {
                    System.out.println("Invalid user input: " + x);
                }
            }
        }
    }
}
