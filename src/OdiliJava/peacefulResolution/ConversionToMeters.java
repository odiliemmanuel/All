package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class ConversionToMeters {
            public static void main(String[] args){
                Scanner input = new Scanner(System.in);

        System.out.println("Enter A Value In Feets ");
            double feet = input.nextDouble();

            double OneFoot = 0.305;
            double meters = feet * OneFoot;
    
        System.out.println("The Conversion of " + feet + " feet to meters is " + OneFoot + "meters");
            }
        }
