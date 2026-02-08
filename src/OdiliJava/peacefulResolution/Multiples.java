package OdiliJava.peacefulResolution;

import java.util.Scanner;

    public class Multiples {
    
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            int numberOne = input.nextInt();
      System.out.println("Enter First Integer " + numberOne); 
             
                int numberTwo = input.nextInt();
          System.out.println("Enter Second Integer " + numberTwo);
             
        int numberOneCube = numberOne * 3;
    System.out.println("The  First Number Tripled is " + numberOneCube);

        int numberTwoSquare = numberTwo * numberTwo;
    System.out.println("The Second Number Doubled is " + numberTwoSquare);

        if( numberOneCube % numberTwoSquare == 0) {
    System.out.println("numberOneCube Is A Multiple Of " + numberTwoSquare);
        }
        else{
        }System.out.println("numberOneCube is not a multiple of " + numberTwoSquare);
    }
}
