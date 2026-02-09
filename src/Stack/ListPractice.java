package Stack;

public class ListPractice {

    private int capacity = 4;
    private String[] list = new String[capacity];
    private int index = -1;
    private int  size = 0;


    public boolean isEmpty() {

        return index == - 1;
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

            list[position] = input;
        }
        size ++;
    }


    public int size(){

        return size;
    }


    public String remove(String input) {
        if(isEmpty()){
           throw new IllegalArgumentException("Operation cannot work for Empty list");

        }

        for(int count = 0; count < size; count ++) {
            String result = "";
            if (list[count].equals(input)){
                result = list[count];
            }

            size -= 1;
            return result;
        }

        return null;

    }

//    public String removeFrom(int indexInput) {
//
//    }
}
