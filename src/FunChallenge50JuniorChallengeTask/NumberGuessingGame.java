package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class NumberGuessingGame {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


    final int SECRET = 8;
    int guess = 0;

    while(guess != SECRET){
        System.out.print("Guess my Number ");
            guess = input.nextInt();
        
        if(guess == SECRET){
            System.out.println("Correct!");
        }

        else{
            System.out.println("Try Again!");
        }

    }



        }
    }
