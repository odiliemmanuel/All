package OdiliJava.peacefulResolution;

import java.util.Scanner;
  public class SeparatingDigits {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

        
    System.out.println("Enter a Five Digit Number " );
              int number = input.nextInt();

        int numberOne = number / 10000;
        int numberTwo = number / 10000 % 10;
        int numberThree = number / 1000 % 10;
        int numberFour = number / 100 % 10;
        int numberFive = number % 10;
    System.out.printf(" %d   %d   %d   %d   %d", numberOne, numberTwo, numberThree, numberFour, numberFive);
    }
    }
