package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class MagicNumber {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
            int number = input.nextInt();

            final int MAGIC_NUMBER = 42;

        if(number == MAGIC_NUMBER){
            System.out.println("You Found The Magic Number!");
            
        }

        else{
            System.out.println("Keep Looking!");
        }


        }
    }
