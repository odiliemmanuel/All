package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class TemperatureCheck {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        System.out.println("Enter a Temperature ");
            int temperature = input.nextInt();


        if(temperature > 30){
            System.out.println("Hot!");
        }

        if(temperature >= 15 && temperature <= 30){
            System.out.println("Nice!");
        }

        if(temperature < 15){
            System.out.println("Cold!");
        }


        }
    }
