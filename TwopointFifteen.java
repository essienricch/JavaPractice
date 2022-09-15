package chapter2;

import java.util.Scanner;

public class TwopointFifteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter first integer: ");
        double first = input.nextDouble();
        System.out.println(" Enter second integer: ");
        double second = input.nextDouble();

        System.out.println("Square of first input: "+first*first);
        System.out.println("Square of second input: "+second*second);
        System.out.println("Sum of both squared: "+((first*first)+(second*second)));
        System.out.println("Difference of both squared: "+((first*first)-(second*second)));

    }
}
