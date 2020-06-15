package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            if (elem % 2 == 0) { System.out.println("even");}

            else if (elem == 0) { break; }

            else{ System.out.println("odd");}
        }

    }

}

