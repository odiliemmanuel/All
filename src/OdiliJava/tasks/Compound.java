package OdiliJava.tasks;

public class Compound {
        public static void main(String[] args) {


        double principal = 1000;
        double rate = 1+ 0.05;
        int amount = 0;
        System.out.println(rate);

        for(int count = 1; count <= 10; count ++) {
             amount = (int) (principal * (int)Math.pow(1.05, count));
           
            System.out.println(count + "\t" + amount);
        }

















//for year in range(1, 11):
//...:
//amount = principal * (1 + rate) ** year
//...:
//print(f'{year:>2}{amount:>10.2f}')
        }
    }
