package Stack;

public class ListPractice {

    private int capacity = 4;
    private String[] list = new String[capacity];
    private int index = -1;
    private int  size = 0;


    public boolean isEmpty() {

        if (index == -1) {
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

        int size = size();
        if(size == 0){
           return "-1";

        }


        for (int count = 0; count < size; count++) {


            if (list[count] == (input)) {
                input = list[count];
            }

            size -= 1;
            return input;
        }



        return null;

    }



//    public String removeFrom(int indexInput) {
//
//        String result = list[indexInput];
//        size --;
//
//        return result;
//    }
}
