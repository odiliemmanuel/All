package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class GratuityTotal {
            public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

    System.out.println("Enter Value For subtotal ");
        double subtotal = input.nextDouble();

    System.out.println("Enter Value For Gratuity Rate ");
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuityRate + gratuity;

    System.out.println("The Gratuity is " + gratuity + " And the Total is " + total);


        }
    }
