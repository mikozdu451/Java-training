package com.company;
import java.util.Scanner;

public class Main {

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        int sum = 0;
        for (;from < to; from++)
        {
            sum += from;
        }
        return sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        int i = Integer.parseInt(args[1]);
        int j = Integer.parseInt(args[2]);
        if (args[0] == "+") { System.out.println(i+j); }
        else if (args[0] == '*') { System.out.println(j*i); }
        else if (args[0] == '-') { System.out.println(i-j); }
        else { System.out.println("Unknown operator"); }
    }
}
