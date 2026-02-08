package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class SimpleCalculator {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


    System.out.println("Enter Two Numbers :");

    System.out.println("Enter First Number ");
        int firstNumber = input.nextInt();

    System.out.println("Enter Second Number ");
        int secondNumber = input.nextInt(); 

    System.out.println("Enter an Operator, add (0) or subtract (1) ");
        int operator = input.nextInt();

      int sum = 0;
      int difference = 1;

    if(operator == sum){
      int solution = firstNumber + secondNumber;
        System.out.println(solution);
    }    

        if(operator == difference){
        int solution = firstNumber - secondNumber;
            System.out.println(solution);
        }   

        }
    }
