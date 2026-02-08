package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class FactorCounter {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


        System.out.println("Enter a number");
            int number = input.nextInt();
            int factor = 0;

        for(int count = 1; count <= number; count ++){

        if(number % count == 0){
            factor ++;
        System.out.print(count + " ");
        }
        
        }


        System.out.println("\nNumbers of Factors: " + factor);

        }
    }
