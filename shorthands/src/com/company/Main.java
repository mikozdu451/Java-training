package com.company;
import java.util.regex.*;
public class Main {

    public static void main(String[] args) {
        String regex = "\\s\\w\\d\\s";
        System.out.println(" A5 ".matches(regex)); // true
        System.out.println(" 33 ".matches(regex)); // true
        System.out.println("\tA4\t".matches(regex)); // true, because it matches tabs as well

    }
}
