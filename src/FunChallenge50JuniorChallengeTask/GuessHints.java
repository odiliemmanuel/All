package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class GuessHints {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


    final int ANSWER = 25;
      
    int guess = 0;
    while(guess != ANSWER) {
        System.out.println("Enter my Number ");
           guess = input.nextInt();
        
        if(guess == ANSWER){
            System.out.println("Correct!");
        }

        if(guess > ANSWER){
            System.out.println("Too high!");
        }

        if(guess < ANSWER){
            System.out.println("Too low!");
        }

        

    }





        }
    }
