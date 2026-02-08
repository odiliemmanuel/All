package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class TrafficLight {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

    System.out.println("Enter a colour ");
        String colour = input.nextLine();

        String yellow = "yellow";
        
        String red = "red";

        String green = "green";

        if(colour.equals(yellow)){
            System.out.println("Wait!");
        }

        if(colour.equals(red)){
            System.out.println("Stop!");
        }

        if(colour.equals(green)){
            System.out.println("Go!");
        }


        }
    }
