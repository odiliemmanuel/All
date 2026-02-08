package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class Range {
            public static void main(String[] args){

        Scanner input = new Scanner(System.in);

    System.out.println("Enter a Number ");
        int number = input.nextInt();

    if (number >= 1 && number <= 100) {
        System.out.println("The Number Is in Range");
    }
    
    else {
        System.out.println("The Number Is out of Range");
    } 
            }
        }
