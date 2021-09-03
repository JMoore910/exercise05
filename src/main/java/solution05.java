import java.util.Scanner;

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
        String num1,num2;
        System.out.printf("What is the first number? ");
        num1 = input.nextLine();
        System.out.printf("What is the second number? ");
        num2 = input.nextLine();
        int num01,num02;
        num01 = Integer.parseInt(num1);
        num02 = Integer.parseInt(num2);
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d",num01,num02,num01+num02,num01,num02,num01-num02,num01,num02,num01*num02,num01,num02,num01/num02);

    }

}
