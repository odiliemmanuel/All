package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class GradeCounter {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);
        System.out.println("Enter your test score from (0- 100) ");
            int number = input.nextInt();

        if(number >= 90 && number <= 100)  {
            System.out.println("A");
        }

        if(number >= 80 && number <= 89){
            System.out.println("B");
        }

        if(number >= 70 && number <= 79) {
            System.out.println("C");
        }

        if(number < 70){
            System.out.println("F");
        }


        }
    }
