package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class PasswordRetry {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        final String  CORRECT_PASSWORD = "python";

        final int COUNTER = 3;
            int numberOfTrials = 0;
    for(int count = 1; count <= COUNTER; count ++){
        System.out.println("Enter Password ");
            String password = input.nextLine();
            numberOfTrials ++;

            if(password.equals(CORRECT_PASSWORD)){
                System.out.println("Success");break;
            }
                
            else if(!password.equals(CORRECT_PASSWORD)){
                System.out.println("Try again");
            }

                

            if(numberOfTrials == COUNTER){
                System.out.println("Locked out!");
            }


        }
   

    }

    }
