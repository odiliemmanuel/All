package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class StudentRecord {
            public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

    System.out.println("Enter Your Name ");
           
        String studentOne = input.nextLine();
        String studentTwo = input.nextLine();
        String studentThree = input.nextLine();

    System.out.println("Enter Your Grades " + studentOne);
        int gradeOne = input.nextInt();
        int gradeTwo = input.nextInt();
        float gradeThree = input.nextFloat();

        float average = gradeOne + gradeTwo + gradeThree / 3;

    System.out.println("The Average of student is" + average);
    

    
            }
        }
