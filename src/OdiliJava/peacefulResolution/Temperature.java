package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class Temperature {
            public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Todays Temperature ");
            int temp = input.nextInt();

    if (temp == 15) {
        System.out.println("It is Cold");
    }
    
    if  (temp >= 15 && temp <= 30) { 

        System.out.println("It is Warm");
    }

     if (temp >= 30) {
        System.out.println("It is Hot");
    }
            
    
           }
        }
