package OdiliJava.tasks;

import java.util.Scanner;
    public class CapitalizeSentence {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);


        System.out.println("Enter an String");
            String word = input.nextLine();

       String firstWord = word.substring(0,1).toUpperCase();
        String remaining = word.substring(0);

        System.out.println(firstWord + remaining);
           }

    }
