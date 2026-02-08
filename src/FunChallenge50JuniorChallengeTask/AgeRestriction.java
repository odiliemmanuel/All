package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class AgeRestriction {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        System.out.println("Enter Your age ");
            int age = input.nextInt();

            final int minimumAge = 10;

        if(age >= minimumAge){
            System.out.println("Welcome To The Show!");
        }
        
        else{
            System.out.println("Sorry, you're too young!");
        }


        }
    }
