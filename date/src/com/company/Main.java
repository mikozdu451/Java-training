package com.company;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate now = LocalDate.parse(scanner.nextLine());
        LocalDate copy = now;
        int off = scanner.nextInt();
        copy = copy.plusDays(off);
        System.out.println(copy);
/*        for (int i = 0; i < 365; i++)
            if (now.getYear() == copy.getYear()) {
                System.out.println(now);
                copy = copy.plusDays(off);
            }
            else { break; }*/
    }
}
