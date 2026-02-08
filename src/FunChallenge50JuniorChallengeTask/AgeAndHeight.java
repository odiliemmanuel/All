package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class AgeAndHeight { 
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);



    System.out.println("WELCOME TO THE ROLLER COASTER APPLICATION SITE ");
    
    System.out.println("Enter Your Age ");
        int age = input.nextInt();

    System.out.println("Enter Your Height ");
        int height = input.nextInt();


    if(age >= 12 && height >= 140) {
        System.out.println("Ride Allowed");
    }
    
    else if (age < 12){
        System.out.println("Too young");
    }
    
    else if(height < 140) {
        System.out.println("Too short");
    }


    






        }
    }
