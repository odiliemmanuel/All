package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class Eligibility {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        
    
        System.out.println("Enter Your Age ");
            int age = input.nextInt();
    
            int eligible = 18;
            

    if (age >= eligible) {
        System.out.println("You Are Eligible To Vote");
    }
    
    else {
        System.out.println("You Are Not Eligible ");
    }
            }
        }
