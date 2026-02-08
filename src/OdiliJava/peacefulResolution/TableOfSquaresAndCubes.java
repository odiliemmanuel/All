package OdiliJava.peacefulResolution;

import java.util.Scanner;
  public class TableOfSquaresAndCubes {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int square = input.nextInt();
        int cubes = input.nextInt();   

        System.out.print(" TABLE OF SQUARES AND CUBES ");
    System.out.printf("%s     %s     %s%n", number,   square,   cubes);
    System.out.printf("%d     %d    %d%n",  0,       0*0,     0*0*0);
    System.out.printf("%d    %d     %d%n",  1,       1*1,     1*1*1);
    System.out.printf("%d    %d     %d%n",  2,       2*2,     2*2*2);
    System.out.printf("%d    %d     %d%n",   3,       3*3,      3*3*3);
    System.out.printf("%d    %d     %d%n",  4,       4*4,       4*4*4);
    System.out.printf("%d    %d     %d%n",  5,       5*5,        5*5*5);
    System.out.printf("%d    %d     %d%n",  6,      6*6,        6*6*6);
    System.out.printf("%d    %d     %d%n",   7,      7*7,         7*7*7);
    System.out.printf("%d    %d     %d%n",   8,      8*8,          8*8*8);
    System.out.printf("%d    %d     %d%n",   9,      9*9,            9*9*9);
    System.out.printf("%d   %d   %d", 10, 10*10,        10*10*10);
        }
      }
