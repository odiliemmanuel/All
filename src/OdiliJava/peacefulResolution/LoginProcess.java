package OdiliJava.peacefulResolution;

import java.util.Scanner;
        public class LoginProcess {
            public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "KHIDBLACK";
        int password = 120976;

     System.out.println("Enter Your Username: ");
        String name = input.nextLine();

     System.out.println("Enter Your Password: ");
        int passcode = input.nextInt();


    if (name != username && passcode != password) {
        System.out.println("Login Not Successful");
    }

    else {
        System.out.println("Login  Successful");
    }

    
            }
        }
