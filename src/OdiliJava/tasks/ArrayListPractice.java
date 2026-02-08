package OdiliJava.tasks;

import java.util.ArrayList;
import java.util.Scanner;

    public class ArrayListPractice {
        public static void main(String[]args) {
            Scanner input = new Scanner(System.in);


            ArrayList<String> fruits = new ArrayList<>();


            System.out.println("Enter the number of foods you want to buy ");
            int numberOfFoods = input.nextInt();


            for (int count = 1; count <= numberOfFoods; count++) {

                System.out.println("Enter Food " + count + " : ");
                String foods = input.next();

                fruits.add(foods);
            }
            System.out.println(fruits);
        }
    }

            


        
       
