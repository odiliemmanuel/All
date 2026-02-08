package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class ComputingBmi {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

            System.out.println("Enter Your Weight In Pounds:");
                float weight = input.nextFloat();

            System.out.println("Enter Height In Inches:");
                float height = input.nextFloat();

                double kilogram = 0.45359237;
                double meters = 0.0254;
                double weightInPounds = weight * kilogram;
                double heightInInches = height * meters; 
                double squareHeightInInches = heightInInches * heightInInches;

                double bmi = weightInPounds * squareHeightInInches;
            System.out.println("The BMI of the Application above is: " + bmi );


            }
        }
