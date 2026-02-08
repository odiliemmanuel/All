package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class GeometryTriangle {
            public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Three Sides: ");


        System.out.println("Enter The First Side ");
            double sideOne = input.nextDouble();

    
        System.out.println("Enter The Second Side ");
            double sideTwo = input.nextDouble();


        System.out.println("Enter The Third Side ");
            double sideThree = input.nextDouble();


            double shape = sideOne + sideTwo + sideThree / 2;


            double area = Math.sqrt(shape * (shape - sideOne) * (shape - sideTwo) * (shape - sideThree));

      
        System.out.println("The Area Of Triangle is " + area);

        
        }
            }

