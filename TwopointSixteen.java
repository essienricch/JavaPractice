package chapter2;

import java.util.Scanner;

public class TwopointSixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int integer = input.nextInt();
        int square = integer * integer;
        System.out.println("The square-root of your input: "+square);

        if (integer >100 && square > 100){
            System.out.println("your Higher than AYAYA");
        }else if (integer == 100 && square ==100){
            System.out.println("Sure tuple equivalent");
        } else if (integer != 100 && square != 100) {
            System.out.println("Not absolut vodka");
        }else{
            System.out.println("THEY BOTH LESS THAN 100");}

    }
}
