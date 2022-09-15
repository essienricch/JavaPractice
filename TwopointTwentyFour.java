package chapter2;

import java.util.Scanner;

public class TwopointTwentyFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;
        int smallest = 10000000;

        for (int i=1; i <= 6; i++){
            System.out.println("Enter a valid number: ");
            int number = input.nextInt();

            if (number > largest){
                largest = number;
            }
            if (number < smallest){
                smallest = number;
            }
        }
        System.out.println("largest input: "+largest);
        System.out.println("smallest input: "+smallest);

//        int largest = 0;
//        int smallest = 99999999;
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Welcome user! Kindly enter numbers: ");
//            int number = input.nextInt();
//            if (number < smallest) {
//                smallest = number;
//            }
//
//            if (number > largest) {
//                largest = number;
//            }
//        }
//        System.out.println("largest: " + largest);
//        System.out.println("smallest: " + smallest);
    }
}
//        largest = Math.max(m, Math.max(n,Math.max(o,Math.max(p,q))));
//        System.out.println("Largest number: "+largest);
//        smallest = Math.min(m,Math.min(n,Math.min(o,Math.min(p,q))));
//        System.out.println("smallest number: "+smallest);
//



