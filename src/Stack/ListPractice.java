package Stack;

public class ListPractice {

    private int index = -1;
    private String[] list = new String[4];

    public boolean isEmpty() {
        return index == - 1;
    }

    public void add(String input) {
        list[index += 1] = input;

    }
}
