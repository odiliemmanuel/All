package OdiliJava.peacefulResolution;

import java.util.Scanner;
public class EggCost {

    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

   System.out.print("Enter value for A1:");
    int valueA1 = input.nextInt();

    System.out.println("Enter value for A2:");
    int valueA2 = input.nextInt();

    System.out.print("Enter value for B1:");
    int valueB1 = input.nextInt();

    System.out.print("Enter value for B2:");
    int valueB2 = input.nextInt();

    double midPoint1 =  (valueA1 + valueB1) / 2;
    double midPoint2 =  (valueA2 + valueB2) / 2;


    System.out.printf("%-20s %-20s %-20s%n", "a", "b", "mid-point");

    System.out.printf("(%-5d, %-5d) (%-5d, %-5d) (%-5f, %-5f) %n", valueA1, valueA2, valueB1, valueB2, midPoint1, midPoint2);


}
}
//
//        String 
//            
//
//    System.out.print("---------------------------------------------");
//    System.out.println("---------------------------------------------");
//    
//    System.out.println("%-10%s  %-10%s  %-10%d ", Name, Age, 12 );

