package OdiliJava.peacefulResolution;

import java.util.Scanner;
    public class NumberComparism {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number ");
            double numberOne = input.nextDouble();

        System.out.print("Enter Second Number ");
            double numberTwo = input.nextDouble();

        if (numberOne > numberTwo) {
            System.out.print("The Larger Number is " + numberOne);
        }
        
        else if (numberTwo > numberOne) {
            System.out.print("The Larger Number is " + numberTwo);
        }

        else { System.out.println("Both Numbers are Equal");
        }
          
        }
    }
