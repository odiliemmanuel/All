package OdiliJava.tasks;

public class Word{
    public static void main(String[] args){
   
        int [] array = {1,3,4,5,12,3,1,4,5,3,22, 13};

        int [] frequency = new int [6];


        for(int count = 0; count < array.length; count ++){

        try{
            ++frequency[array[count]];
         }

        catch(ArrayIndexOutOfBoundsException e){   
            System.out.print(e);

            System.out.printf("array [%d] = %d%n", count, array[count]);

            }
        }

        for(int counter = 1; counter < frequency.length; counter ++)
            System.out.println(counter + " : " + frequency[counter]);












    }
}
