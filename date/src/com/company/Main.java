package com.company;
import java.util.Scanner;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.of(2020, 1, 1, 0, 1, 1).minusSeconds(61);
        System.out.println(now.getDayOfYear());
    }
}
