import java.util.Scanner;

/*
 *    UCF  COP3330 Fall 2021 Assignment 1 Solution02
 *    Copyright 2021 Sean Moore
 */

public class solution05 {
/*
    Create an Application that takes two number strings as input
    Use Integer.parseInt() to convert strings to integers
    then outputs their addition
    subtraction
    multiplication
    and division
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1,s2;
        System.out.printf("What is the first number? ");
        s1 = input.nextLine();
        System.out.printf("What is the second number? ");
        s2 = input.nextLine();
        int i1,i2;
        i1 = Integer.parseInt(n1);
        i2 = Integer.parseInt(n2);
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d",s1,s2,i1+i2,s1,s2,i1-i2,s1,s2,i1*i2,s1,s2,i1/i2); //"THERE CAN ONLY BE ONE," Clancy Brown Screams as he types out the longest print statement ever written on a single line.
    }
}
