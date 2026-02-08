package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class NestedColourIdentifier {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            
            final String COLOUR = "red";
            
            System.out.println("Enter a colour ");
                String colour = input.nextLine().toLowerCase();


            if(colour.equals(COLOUR)){
                for(int count = 1; count <= 3; count ++){
                    System.out.println("Red is awesome");
                
                }


            }


            else{
                System.out.println("I like red better");
            }


        }
    } 
