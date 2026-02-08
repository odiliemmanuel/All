package FunChallenge50JuniorChallengeTask;

import java.util.Scanner;
    public class MultiplesInRange {
        public static void main(String...Odili) {
            Scanner input = new Scanner(System.in);

        System.out.println("Enter a Start Number");
            int startNumber = input.nextInt();

        System.out.println("Enter a Stop Number");
            int stopNumber = input.nextInt();

        for(int count = startNumber; count <= stopNumber; count ++){
            if(count % 4 == 0) {
                System.out.print(count + " ");
            }
        }
            

        }
    }
