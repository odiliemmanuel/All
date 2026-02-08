package OdiliJava.peacefulResolution;

import java.util.Random;
    import java.util.Scanner;
        public class ForLoop {
            public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
    int guess = random.nextInt(1, 10);

    System.out.println("Enter a random number: ");
    int numberRand = input.nextInt();
    

        for(int count = 1; count <= 10; count++) {
        

        if ( numberRand > guess){
            System.out.println("Number is too high, guess again");
          }
         if(numberRand < guess) {
            System.out.println("Number is too low, guess again");
        }

        if (numberRand == guess){
            System.out.println("Number Guessed Correctly, the number is " + guess);
        }       
            break;

        }
      
        }
        
    
    }
        
        

















