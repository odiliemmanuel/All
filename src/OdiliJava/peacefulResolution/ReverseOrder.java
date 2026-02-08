package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class ReverseOrder {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        System.out.println("Enter A four Digit Number ");
            int number = input.nextInt();

            int firstNumber = number / 1000;
            int secondNumber = number / 100;
            int firstSecondNumber = secondNumber % 10;
            int thirdNumber = number/10;
            int firstThirdNumber = thirdNumber % 10;
            int fourthNumber = number % 10;

        System.out.println("The Reverse The Number is " + fourthNumber + firstThirdNumber + firstSecondNumber + firstNumber);

            }
        }
