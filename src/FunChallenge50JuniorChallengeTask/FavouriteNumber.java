package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class FavouriteNumber{
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        System.out.println("Guess a Number");
            int guess = input.nextInt();

            final int number = 7;

        if(guess == number){
            System.out.println("That's my favorite number!");
        }

        else{
            System.out.println("Nice try, guess again!");
        }

        


        }
    }
