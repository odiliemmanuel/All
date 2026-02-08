package OdiliJava.peacefulResolution;

import java.util.Scanner;

        public class FindingNumbers {

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);


        System.out.println("Enter Value For Minutes ");
            int minutes = input.nextInt();


            int minutesInAnHour = 60 *1;
            int minutesInADay = 60 * 24;
            int minutesInYear = minutesInADay * 365;
            
            int resultForYears = minutes / minutesInYear;
    System.out.println("Years: " + resultForYears);

            int resultForDays = minutes % minutesInYear;
            int resultForDaysContd = resultForDays / minutesInADay;
            

    System.out.println("In " + minutes + " They Are " + resultForYears + " years and " + resultForDaysContd +  "days");
        }

    }
