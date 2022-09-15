package chapter2;

import java.util.Scanner;

public class TwoPointEight {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("ENTER an integer b: ");
        int b = input.nextInt();
        System.out.print(" Enter an integer c: ");
        int c = input.nextInt();
        int a = b * c;
        //THE OUTPUT BELOW DISPLAYS OR PERFORMS
        // A SAMPLE PAYROLL CALCULATIONAL OPERATION
        System.out.println("Total of both variables: "+a);
    }
}
