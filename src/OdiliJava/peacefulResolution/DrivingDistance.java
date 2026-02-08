package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class DrivingDistance {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

            
            System.out.println("Enter The Distance To Drive: ");
                double distance = input.nextDouble();

            System.out.println("The Fuel Efficiency Of The Car In Miles Per Gallon is: ");
                double milesPerGallon = input.nextDouble();

            System.out.println("The Price Per Gallon Of The Car is: ");
                double pricePerGallon = input.nextDouble();

                double cost = distance / milesPerGallon * pricePerGallon;
            System.out.println("The Total Cost Of The Driving is: " + cost);
            }
        }
