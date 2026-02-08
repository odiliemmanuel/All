package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class ReadingMiles {
            public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);

        System.out.println("Enter A Value For Mile ");
            double mile = input.nextDouble();
            double OneMile = 1.6;
            double kilometers = mile * 1.6;

        System.out.println("The Value " + mile + "miles is " + kilometers + "kilometers");

        }
    }
