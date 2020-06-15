package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] max = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { max[i][j] = 0; }
                else if (j == 0) { max[i][j] = i; }
                else if (i > j){ max[i][j] = i - j;}
                else { max[i][j] = j - i;}
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(max[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
