package OdiliJava.peacefulResolution;

import java.util.Scanner;

    public class Transactions {
        public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

       double balance = 10000;
    System.out.print("Your balance is " + balance);

        double amount = input.nextDouble();
    System.out.println("Withdraw money " + amount);
      
    System.out.println("Enter three digit Password ");
    double password = input.nextDouble();
    

    if (amount > balance) {
        System.out.print("Oops, you do not have sufficient amount to make this transactoin");
    }
     else { System.out.println("You have Successfully Withdrawn" + amount);
     }

            double currentBalance = balance - amount;
        System.out.println("Your Remaining Balance is " + currentBalance);
         
        }
    }
