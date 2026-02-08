package OdiliJava.peacefulResolution;

import java.util.Scanner;
    
    public class DiameterOfCircle {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Integer For Radius Of A Circle ");
        int radius = input.nextInt();

      float diameter = 2 * radius;
  
        final double PI = 3.141591;

        double circumference = 2 * PI * radius;

      double area = PI * radius * radius;
    
    System.out.printf("The Diameter Of The Circle is %f%nThe Circumference for The Circle is %f%nThe Area For The Circle is %f", diameter, circumference, area); 

    
        }
    }
