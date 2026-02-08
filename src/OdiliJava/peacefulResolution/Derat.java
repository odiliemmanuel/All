package OdiliJava.peacefulResolution;

public class Derat {
        public static void main(String[] args){

            Student accountOne = new Student("Jane Green", 93.5);
            Student accountTwo = new Student ("John Blue", 72.75);

        System.out.printf("%s's letter grade is: %s%n",
            accountOne.getName(), accountOne.getLetterGrade());

        
        System.out.printf("%s's letter grade is: %s%n",
            accountTwo.getName(), accountTwo.getLetterGrade());

        }

    }
