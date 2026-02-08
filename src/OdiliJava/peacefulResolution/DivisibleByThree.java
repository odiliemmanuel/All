package OdiliJava.peacefulResolution;

import java.util.Scanner;
public class DivisibleByThree {
    
        public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer ");
            int number = input.nextInt();

        if (number % 3 ==  0) {
        System.out.println("Number is Divisible By Three");
        }

        if (number % 3 != 0) {
        System.out.println("Number is not Divisible By Three");
        }
}
}

