package OdiliJava.peacefulResolution;

import java.util.Scanner;

    public class ArithmeticSmallestAndLargest {

        public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number ");
            int numberOne = input.nextInt();


        System.out.print("Enter Second Number ");
            int numberTwo = input.nextInt();

        System.out.print("Enter Third Number ");
            int numberThree = input.nextInt();

            int sum = numberOne + numberTwo + numberThree;
        System.out.println("The Sum Of The Numbers is " + sum);

            int average = sum / 3;
        System.out.println("The Average Of The Numbers " + average);

            int product = numberOne * numberTwo * numberThree;
        System.out.println("The Product Of Numbers is " + product);

        if (numberOne > numberTwo && numberOne > numberThree) {
        System.out.println("The Largest Number is " + numberOne);
        }
       
        if (numberTwo > numberOne && numberTwo > numberThree) {
        System.out.println("The Largest Number is " + numberTwo);
        }

        if (numberThree > numberOne && numberThree > numberTwo) {
        System.out.println("The Largest Number is " + numberThree);
        }

        if (numberOne < numberTwo && numberOne < numberThree) {
        System.out.println("The Smallest Number is " + numberOne);
        }

        if (numberTwo < numberOne && numberTwo < numberThree) {
        System.out.println("The Smallest Number is " + numberTwo);
        }

        if (numberThree < numberOne && numberThree < numberTwo) {
        System.out.println("The Smallest Number is " + numberThree);
        }        
        
        
        }
    }
