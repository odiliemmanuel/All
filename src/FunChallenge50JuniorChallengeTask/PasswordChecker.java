package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class PasswordChecker {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Password to Login ");
                String passcode = input.nextLine();

                final String password = "secret123";
        
                if(passcode.equals(password)){
                    System.out.println("Access granted! Welcome!");
                }

                else{
                    System.out.println("Access Denied");
                }

        }
    }
