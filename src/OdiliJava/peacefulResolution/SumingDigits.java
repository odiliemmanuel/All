package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class SumingDigits {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

    
        System.out.println("Enter An Integer That Is Between 0 and 1000");
            int number = input.nextInt();
        System.out.println( number > 0 && number < 100 ? "Continue": "Invalid Entry" );

            int firstNumber = number / 100;
            int secondNumber = number / 10;
            int thirdNumber = number % 10;

             int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The Sum Of The Digit Number Separated is " + sum);

        
            }
        }
