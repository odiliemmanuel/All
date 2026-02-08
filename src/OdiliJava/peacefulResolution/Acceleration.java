package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class Acceleration {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        System.out.println("Enter Starting Velocity:");
            float v0 = input.nextFloat();

        System.out.println("Enter Stopping Velocity:");
            float v1 = input.nextFloat();
        
        System.out.println("Enter the Time Taken:");
            float time = input.nextFloat();

            float average = v1- v0 / time;
        System.out.println("The Average Acceleration Taken is: " + average + "m/s");
            }
        }
