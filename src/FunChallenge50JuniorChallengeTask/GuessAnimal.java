package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class GuessAnimal {
        public static void main(String...Odili){
            Scanner input = new Scanner(System.in);

        final String  myAnimal = "dog";
    
        System.out.println("Guess My Animal ");
            String animal = input.nextLine();

        if(animal.equals(myAnimal)){
            System.out.println("Correct It's a dog!");
        }

        else{
            System.out.println("Nope, It's a dog!");
        }
    

        

        }
    }
