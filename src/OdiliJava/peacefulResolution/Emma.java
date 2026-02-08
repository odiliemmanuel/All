package OdiliJava.peacefulResolution;

import java.util.Scanner;
        
        public class Emma {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("Enter Your Full Name: ");
                String name = input.nextLine();

                System.out.println("Enter Your Age: ");
                int age = input.nextInt();

                System.out.println("Subjects Studied in School: ");
                String numbers;
                String subjectOne = input.nextLine();
                String subjectTwo = input.nextLine();
                String subjectThree = input.nextLine();
                String subjectFour = input.nextLine();
                String subjectFive = input.nextLine();
                String subjectSix = input.nextLine();
                String subjectSeven = input.nextLine();
                String subjectEight = input.nextLine();
                String subjectNine = input.nextLine();

                System.out.println("Enter Favourite Food: ");
                String food = input.nextLine();
                String univ = "Yes";
                String unive = "No";
                String city = "Lagos";

                System.out.println("Have You Entered The University: ");
                String uni = input.nextLine();

                if (uni == univ) {
                    System.out.println("Don't Worry You Will Enter ");
                } else {
                    System.out.println("Invalid Entry ");
                }

                System.out.println("Where do you Reside currently: ");
                String reside = input.nextLine();

                if (reside.equals(city)) {
                    System.out.println("Wow, that's a nice place ");
                } else {
                    System.out.println("Ewww, that's a dirty place ");
                }


                System.out.println("Do you Love Semicolon: ");
                String like = input.nextLine();

                System.out.print("Explain Why?? ");
                String explain = input.nextLine();

            }
        }