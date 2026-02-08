package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class InvestmentAmount {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);


        System.out.println("Enter Value For Investment Amount: ");
            double investAmount = input.nextDouble();

        System.out.println("Enter Value For Annual Interest Rate In Percentage: ");
            double annualInterest = input.nextDouble();

        System.out.println("Enter The Number Of Years: ");
            double years = input.nextDouble();

            double monthlyInterestRate = annualInterest / 1200;
            double interestRate = 1 + monthlyInterestRate;
            double numberOfYears = years * 12;
            double futureInvestmentValue = investAmount * Math.pow(interestRate, numberOfYears);

        System.out.println("The Future Investment Value is " + futureInvestmentValue);

        
            }
        }
