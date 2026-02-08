package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class EnergyCalculation {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

    
        System.out.println("Enter The Amount Of Water In Kilograms: ");
            double amountWater = input.nextDouble();

        System.out.println("Enter The Initial Temperature: ");
            double initial = input.nextDouble();

        System.out.println("Enter The Final Temperature: ");
            double last = input.nextDouble();

            double energy = amountWater * (last - initial) * 4184;

        System.out.println("The Energy Needed To Heat Water From An Initial Temperature To The Final Temperature is: " + energy);
            }
        }
