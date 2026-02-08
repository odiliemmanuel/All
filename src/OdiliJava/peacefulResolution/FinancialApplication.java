package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class FinancialApplication {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                double balance = 203000;
        System.out.println("Your balance: " + balance);

        System.out.println("The Annual Percentage Interest Rate is: ");
            double annualInterestRate = input.nextDouble();

            double interest = balance * annualInterestRate / 1200;
        System.out.println("Your Interest For The Next Month is " + interest);
        
    
            }
        }
