package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class NestedColorGame {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


    final String favoriteColor = "blue";

    int counter = 0;

    String answer = "";

    while(!answer.equals(favoriteColor)){
        for(int count = 1; count <= 3; count ++){
        
        System.out.println("Guess my color ");
            answer = input.nextLine();

        if(!answer.equalsIgnoreCase(favoriteColor)){
            System.out.println("");
        }

        }
    }
        

        }
    }
