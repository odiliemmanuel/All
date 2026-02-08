package OdiliJava.peacefulResolution;

import java.util.Scanner;

    public class ComparingIntegers {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

        System.out.print("Enter One Integer ");
            int numberOne = input.nextInt();

             int numberTwo;
            numberTwo = 100;
        System.out.println("Number to be compared with is " + numberTwo);
           

            int squareOfNumOne = numberOne * numberOne;
        System.out.println("The Square Of Number One is " + squareOfNumOne);

        if (squareOfNumOne > numberTwo) {
            System.out.printf("%d > %d%n", squareOfNumOne, numberTwo);
        }

        if (squareOfNumOne == numberTwo) {
            System.out.printf("%d == %d%n", squareOfNumOne, numberTwo);
        }

        if (squareOfNumOne != numberTwo) {
            System.out.printf("%d != %d%n", squareOfNumOne, numberTwo);
        }

        if (squareOfNumOne < numberTwo) {
            System.out.printf("%d < %d%n", squareOfNumOne, numberTwo);
        }
        
        }
    }
