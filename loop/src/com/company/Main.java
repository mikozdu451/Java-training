package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) { numbers[i] = scanner.nextInt(); }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i < size - 1; i++){
            if (numbers[i] == n && numbers[i+1] == m || numbers[i] == m && numbers[i+1] == n) {
                check = false;
                break;
            }
        }

        System.out.println(check);
    }
}
