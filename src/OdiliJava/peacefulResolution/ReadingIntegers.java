package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class ReadingIntegers {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);



        System.out.println("Enter six Integers:");
            int numberOne = input.nextInt();
            int numberTwo = input.nextInt();
            int numberThree = input.nextInt();
            int numberFour = input.nextInt();
            int numberFive = input.nextInt();
            int numberSix = input.nextInt();


                if (numberOne % 2 == 0 && numberTwo % 2 == 0 && numberThree % 2 == 0  && numberFour % 2 == 0 && numberFive % 2 == 0 && numberSix % 2 == 0) {
                    System.out.println(" They Are Even Numbers:" + numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix);
                } else {
                    System.out.println("They Are Odd Numbers: " + numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix);
                }


            }
            }
