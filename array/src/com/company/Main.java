package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 4, 5, 6};
        int pos = Arrays.binarySearch(arr, 2);
        System.out.println(~pos);
        System.out.println("Finished");
    }
}
