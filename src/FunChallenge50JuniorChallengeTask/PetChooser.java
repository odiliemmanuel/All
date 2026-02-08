package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class PetChooser{
        public static void main(String...Odili) {

            Scanner input = new Scanner(System.in);


        System.out.println("Pick a Favourite Pet");
            String petname = input.nextLine();
            
           final String condition = "dog";


            if(petname.equals(condition)){
                System.out.println("Woof! Dogs are awesome");
                
            }
            
            else{
                System.out.println("Cool choice, but I love dogs!");
            }

        
        }
    }
