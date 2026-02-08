package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class SimpleQuiz {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


              final String ANSWER = "paris";

                    String answer = "";
                int counter = 0;

            while(!answer.equals(ANSWER)){
                System.out.println("What's the Capital of France");
                     answer = input.nextLine();
                    counter ++;

                if(answer.equals(ANSWER)){
                    System.out.println("Correct");break;
                }

                else{
                    System.out.println("Try Again");
                }

                if(counter >= 3){
                    System.out.println("You have reached trial limit");break;
                }
                
            
            }
        }
    }
