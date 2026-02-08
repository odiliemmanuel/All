package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class ConversionToKilogram {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        
        System.out.println("Enter A Number In Pounds ");
            double pound = input.nextDouble();

            double poundUnit = 0.454;
            double kilogramResult = pound * poundUnit;

        System.out.println("The Conversion of " + pound + " Pounds To Kilogram is " + kilogramResult + " kilograms");
            
            }
        }
