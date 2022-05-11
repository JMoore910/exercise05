/*
 *    UCF  COP3330 Fall 2021 Assignment 1 Solution05
 *    Copyright 2021 Sean Moore
 */

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Solution05 {
/*
    Create an Application that takes two number strings as input
    Use Integer.parseInt() to convert strings to integers
    then outputs their addition
    subtraction
    multiplication
    and division
 */
    public static void main(String[] args) {
        //  Use a scanner as input to take in two numbers
        Scanner input = new Scanner(System.in);
        String s1;
        String s2;
        System.out.print("What is the first number? ");
        s1 = input.nextLine();
        System.out.print("What is the second number? ");
        s2 = input.nextLine();
        
        //  Use parseInt() to turn the input strings into integers
        int i1;
        int i2;
        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);
        
        //  Calculate sum, difference, product, and quotient
        int sum = i1+i2;
        int dif = i1-i2;
        int pro = i1*i2;
        int quo = i1/i2;
        
        //  output the two numbers, the sum, difference, product, and quotient
        System.out.print("%d %d %d %d %d %d", i1, i2, sum, dif, pro, quo);
    }
}
