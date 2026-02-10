package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;

    @BeforeEach
    public void startEachMethodWithThis(){

        queue = new Queue();
    }


    @Test
    public void testThatQueueIsEmpty(){

        assertTrue(queue.isEmpty());
    }


    @Test
    public void testThatICanAddToQueue(){
        queue.add("Obi");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatICannotAddWhenQueueIsFull(){
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertFalse(queue.add("obi"));

    }

    @Test
    public void testThatIfIOfferAnElementSizeIncreases(){
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertEquals(3, queue.getSize());
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("obi"));
        assertEquals(7, queue.getSize());
    }

    @Test
    public void testThatICanRemoveFromQueue(){
        assertTrue(queue.add("Ada"));
        assertTrue(queue.add("Obi"));
        queue.poll();
        assertEquals(1, queue.getSize());

    }


    @Test
    public void testThatIfPollAnElementSizeDecreases(){
        assertTrue(queue.add("Ada"));
        assertTrue(queue.add("Obi"));
        queue.remove();
        assertEquals(1, queue.getSize());
    }


    @Test
    public void testThatICannotRemoveFromAnEmptyQueue(){
        assertEquals(null, queue.remove());

    }

    @Test
    public void testThatICanSeeTheElementAtTheFirstPosition_OrIndex(){
        assertTrue(queue.add("Ada"));
        assertTrue(queue.add("Obi"));
        assertTrue(queue.add("john"));
        assertTrue(queue.add("james"));
        queue.poll();
        queue.remove();
        assertEquals("john", queue.peek());
    }

    @Test
    public void testThatICannotSeeFromAnEmptyQueue(){
        assertTrue(queue.add("john"));
        assertTrue(queue.add("james"));
        queue.poll();
        queue.remove();
        assertEquals(null, queue.element());
    }
}
