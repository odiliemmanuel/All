package OdiliJava.peacefulResolution;

import java.util.Scanner;

    public class Arithmetic {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.print("Enter First Integer ");
       int numberOne = input.nextInt();

    System.out.print("Enter Second Integer ");
        int numberTwo = input.nextInt();

        int squareNumOne = numberOne * numberOne;
    System.out.println("The Square Of First Integer Is " + squareNumOne);

        int squareNumTwo = numberTwo * numberTwo;
    System.out.println("The Square Of Second Integer Is " + squareNumTwo);

        int differenceOfSquares = squareNumOne - squareNumTwo;
    System.out.println("The Difference of The Squares is " + differenceOfSquares);

        }
    }
