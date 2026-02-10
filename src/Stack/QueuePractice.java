package Stack;

public class QueuePractice<Odils> {
    private int index = -1;
//    @SuppressWarnings("unchecked")
    private Odils[] queue = (Odils[]) new Object[7] ;
    private int size = 0;
    private int firstIndex = 0;
    private final int MAXIMUM_SPACE = 7;




    public boolean isEmpty() {
        return index == -1;

    }



    public void offer(Odils input) {
        if(size == queue.length){
           throw new IllegalArgumentException("Queue is full");
        }

        queue[index += 1] = input;
        size ++;

    }



    public boolean add(Odils input){
        if(size == queue.length){
            return false;
        }
        queue[index += 1] = input;
        size ++;
        return true;
    }


    public Odils poll() {
        if(isEmpty()){
            throw new IllegalArgumentException("Queue is Empty, cannot pull out element");
        }
        Odils result = queue[index ++];
        size --;
        firstIndex ++;
        return result;
    }



    public Odils remove(){
        if(isEmpty()){
            return null;
        }
        Odils result = queue[index ++];
        size --;
        firstIndex ++;
        return result;

    }



    public int getSize() {
        return size;
    }



    public Odils peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("Cannot see element from an empty queue");
        }
        return queue[firstIndex];
    }




    public Odils element(){
        if (isEmpty()){
            return null;
        }

        return queue[firstIndex];
    }


}
