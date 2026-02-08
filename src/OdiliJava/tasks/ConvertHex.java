package OdiliJava.tasks;

import java.util.Scanner;
    public class ConvertHex {
        public static void main(String...Odili){
           Scanner input = new Scanner(System.in);



        System.out.println("Enter a Hexadecimal Digit ");
            String hexValue = input.nextLine().toUpperCase();

        
        if(hexValue.length() != 1){
            System.out.println("You must enter one value");
        }
        
        char value = hexValue.charAt(0);

         if(value <= 'F' && value >= 'A'){
                int result = value - 'A' + 10;
            System.out.println("The decimal value for " + hexValue + " is " + result);
        }

        else if(Character.isDigit(value)){

                System.out.println("The decimal value of " + hexValue + " is " + hexValue);

        }



        else{
            System.out.println("Invalid Input");
        }

        






        }
    }
