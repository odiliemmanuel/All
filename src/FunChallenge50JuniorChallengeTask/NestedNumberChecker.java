package FunChallenge50JuniorChallengeTask;

public class NestedNumberChecker {
        public static void main(String...Odili) {

        System.out.println("Play Fuzz Buzz Game");
        

        for(int count = 1; count <= 15; count ++){

            if(count % 3 == 0 && count % 5 == 0){
                System.out.println(count + " FizzBuzz!");
            }
            
           else if(count % 3 == 0){
                System.out.println(count + " Fizz");
            }

            else if(count % 5 == 0) {
                System.out.println(count + " Buzz");
            }


        }


        }
    }
