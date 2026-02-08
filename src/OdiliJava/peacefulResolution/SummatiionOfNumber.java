package OdiliJava.peacefulResolution;//understanding phase:

//- prompt the user to enter a set of integers
//- print the sum of the even and odd numbers

//breakdown stage:
//- prompt the user to enter six integers
//- collect the numbers
//- store as "numbers"

//- add up the even numbers
//- collect the value
//- store as "sumOfEvenNumbers"

//- add up the odd numbers
//- collect the value
//- store as "sumOfOddNumbers"

import java.util.Scanner;
public class SummatiionOfNumber{
    public static void main(String... esther){
        Scanner input = new Scanner(System.in);

        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        int counter = 1;

        while (counter <= 3){
            System.out.print("Enter three integers: ");
            int numbers = input.nextInt();

            if(numbers % 2 == 0){
                sumOfEvenNumbers += numbers;
            }
            else{
                sumOfOddNumbers += numbers;
            }
            counter++;

        }
            System.out.println("The sum of the even numbers is: " + sumOfEvenNumbers);
            System.out.print(" The sum of the odd numbers is: " + sumOfOddNumbers);
       
        



}

}


