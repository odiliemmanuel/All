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

//display "sumOfEvenNumbers"
//display "sumOfOddNumbers"


    import java.util.Scanner;
        public class ReadingForloop {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

    for (int counter = 1; counter <= 3; counter ++) {
        System.out.print("Enter Three Numbers: ");
            int numbers = input.nextInt();
        

        if (numbers %2 == 0) {

        sumOfEvenNumbers += numbers;
        }

        else {
        sumOfOddNumbers += numbers;
        }
    }

            System.out.println("The Sum Of Even Numbers Is " + sumOfEvenNumbers);
            System.out.print(" The Sum Of Odd Numbers Is " + sumOfOddNumbers);
            }
        }
