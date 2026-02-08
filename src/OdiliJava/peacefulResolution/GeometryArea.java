package OdiliJava.peacefulResolution;

import java.util.Scanner;
    public class GeometryArea {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

    System.out.print("Enter value for length of pentagon ");
        double lengthPent = input.nextDouble();

        double lengthSquare = lengthPent * lengthPent;
    System.out.println("The Square of the Length is " + lengthSquare);

        double pie;
        pie = 3.142;
    System.out.println("The value for pie is " + pie);

        double sideLength;
        sideLength = 2 * lengthPent * Math.PI*2;
    System.out.println("The length of the side is " + sideLength);

        double area;
        area = 5 * sideLength * sideLength / 4 * pie/5;
    System.out.println("The Area is " + area);


        }

    }
