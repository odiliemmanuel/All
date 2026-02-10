package Stack;

public class ListPractice {

    private int capacity = 4;
    private String[] list = new String[capacity];
    private int index = -1;
    private int  size = 0;


    public boolean isEmpty() {

        if(index == -1) {
            return true;
        }
        else {
            return false;
        }
    }


    public void add(String input) {

        if(size == list.length) {

            capacity *= capacity;
            list[index += 1] = input;
        }

        size++;



    }


    public void addTo(int position, String input){
        if(size == list.length){
            capacity *= capacity;
            if(list[position] != null){
                position ++;
                size --;
                list[position] = input;
            }


        }
        size ++;
    }


    public int size(){

        return size;
    }


    public String remove(String input) {

        if(size == 0){
           return "Empty";

        } else if (input.equals("")) {

            return "Invalid";

        }

        for(int count = 0; count < size; count++) {
            String result = "";

            if (list[count] == (input)) {
                result = list[count];

            }
            --size;
            return result;

        }

        return null;

    }


    public String removeFrom(int input) {
        if(size == 0){
            return "Empty";
        }
        else if (input == 0) {

            return "Invalid";

        }

        for(int count = 0; count < size; count ++){
            String result = "";
            if(input == count){
                result = list[count];
            }
            size --;
            return result;
        }

        return null;
    }


    public void set(int index, String input) {
        for(int count = 0; count < list.length; count ++){
            if(count == index){
                list[count] = input;
            }

        }
        size ++;
    }

    public boolean contains(String input) {
       for(String count : list){
           if(input.equals(count)){
               return true;
           }
       }
       return false;
    }
}
