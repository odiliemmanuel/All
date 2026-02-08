package OdiliJava.peacefulResolution;

import java.util.Scanner;
    public class NegativeValues {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        String condition = "No";
        String answer = " ";

           System.out.println(" Enter first Number ");
           int numberOne = input.nextInt();

    System.out.println("Enter Second Number ");
       int numberTwo = input.nextInt();

    System.out.println("Enter Third Number ");
      int numberThree = input.nextInt();

    System.out.println("Enter Fourth Number ");
      int numberFour = input.nextInt();

    System.out.println("Enter Fifth Number ");
      int numberFive = input.nextInt();
          
               
      int countNegative = 0;
      int countPositive = 0; 
      int countZero = 0;

    if (numberOne > 0) {
        countPositive ++;  
   }
        else if (numberOne < 0) {
            countNegative ++;
    }
        else {
            countZero ++;
    }


        if (numberTwo > 0) {
            countPositive  ++; 
        }

      else if(numberTwo < 0) {
        countNegative  ++;
    }
        else {
            countZero ++;
      }


         if(numberThree >0) {
    countPositive  ++;

    }
        else if (numberThree < 0) {

        countNegative ++;
    }
        else {
            countZero ++;
    }



           
         if(numberFour > 0) {
    countPositive  ++;

    }
        else if (numberFour < 0) {

        countNegative  ++;
    }

        else {
            countZero ++;
    }




              
         if(numberFive > 0) {
    countPositive  ++;


    }
        else if (numberFive < 0) {

        countNegative ++;
    }
        else {
            countZero ++;
    }


        

        System.out.println("The Total number of positive numbers is " + countPositive);
        System.out.println("The Total number of negative numbers is " + countNegative);
        System.out.println("The Total number of zero numbers is " + countZero);
    }
}
