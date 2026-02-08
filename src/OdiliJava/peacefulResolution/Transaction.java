package OdiliJava.peacefulResolution;

import java.util.Scanner;

    public class Transaction {
        public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);

                int balance = 10000;
            System.out.print("Your balance is " + balance);

                int amount = input.nextInt();
                int password = input.nextInt();

            if (amount > balance) {
                System.out.print("Oops, you do not have sufficient amount to make this transactoin");
            }
             else { System.out.println("You have Successfully Withdrawn" + amount);
             }

                    int currentBalance = balance - amount;
                System.out.println("Your Remaining Balance is " + currentBalance);

        }
    }
