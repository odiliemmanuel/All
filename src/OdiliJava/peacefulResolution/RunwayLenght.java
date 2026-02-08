package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class RunwayLenght {
            public static void main(String... esther){
                Scanner input = new Scanner(System.in);




    System.out.println("Enter A Value For Speed(v) ");
        double speed = input.nextDouble();

    System.out.println("Enter A Value For Acceleration(a) ");
        double acceleration = input.nextDouble();

        double lenght = speed * speed / 2 * acceleration;
    System.out.println("The Minimum Lenght For The Airplane is " + lenght);

    }
}
