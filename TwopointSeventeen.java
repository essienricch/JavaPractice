package chapter2;

import java.util.Scanner;

public class TwopointSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int one = input.nextInt();
        System.out.println("Enter a number2: ");
        int two = input.nextInt();
        System.out.println("Enter a number3: ");
        int three = input.nextInt();

        System.out.println("Sum: "+(one+two+three));
        System.out.println("Average: "+(one+two+three)/3);
        System.out.println("Product: "+(one*two*three));
        System.out.println("Largest: "+(Math.max(one,Math.max(two,three))));
        System.out.println("Smallest: "+(Math.min(one,Math.min(two,three))));
    }
}
