package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class RollingDice {
            public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);


        System.out.print("Range Number: " );
            int rangOne = 1;
            int rangeTwo = 2;
            int rangeThree = 3;
            int rangeFour = 4;
            int rangeFive = 5;
            int rangeSix = 6;


        System.out.println("Enter A Number From The Given For First Roll:");
            int diceOne = input.nextInt();
        
        System.out.println(diceOne < 1 && diceOne > 6? "Invalid": "Continue");
            
        

        System.out.println("Enter Another Number From The Range:");
            int diceTwo = input.nextInt();

        System.out.println(diceTwo < 1  && diceTwo > 6? "Invalid": "Continue");
        
        

                int sum = diceOne + diceTwo;
        System.out.println("The Value Given When You Rolled The Pair Of Dice Is " + sum);

        

    }
}
        
