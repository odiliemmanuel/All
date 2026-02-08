package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class PinEntrySystem {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


        final int PIN = 1234;
        int entry = 0;
        
                    int counter = 0;
                while(entry != PIN){
            
                    System.out.println("Enter Password To Enter");
                        entry = input.nextInt();
                        counter ++;

                    if(entry == PIN){
                        System.out.println("Access Granted!");
                    }

                
                    if(entry != PIN){
                        System.out.println("Try Again");
                   
                }

                    if(counter == 3){
                        System.out.println("Locked");break;
                    }
                
                    
                }


        }
    }
