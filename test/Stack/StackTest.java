package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    public void startEachMethodWithThis(){

        stack = new Stack();
    }

    @Test
    public void testThatStackIsEmpty() {
        assertTrue(
                stack.isEmpty());
    }


    @Test
    public void testThatICanPushToStackAndStackIsNotEmpty(){
        assertTrue(stack.isEmpty());
        stack.push("Obinna");
        stack.push("Adanna");
        assertEquals(false,stack.isEmpty());
    }


    @Test
    public void testThatIfIPushToStackElementsEnterSimultaneously(){
        assertTrue(stack.isEmpty());
        stack.push("12");
        stack.push("90");
        stack.push("47");
        assertFalse(stack.isEmpty());
        assertEquals("90", stack.stack[1]);
    }

    @Test
    public void testThatIfPushToStackSizeOfElementsInStackIncreases(){
        stack.push("12");
        stack.push("90");
        stack.push("47");
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());
    }

    @Test
    public void testThatIfIPushWithoutIncrementingIndexSizeRemains0(){
        stack.push("12");
        stack.push("10");
        stack.push("90");
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());
    }

    @Test
    public void testThatIfIPopSizeDecreasesBy1(){
        stack.push("12");
        stack.push("10");
        stack.push("90");
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());

        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());

    }

    @Test
    public void testThatCapacityReturnStacksLength(){
        stack.push("12");
        stack.push("10");
        stack.push("90");
        assertFalse(stack.isEmpty());
        assertEquals(7, stack.capacity());
    }

    @Test
    public void testThatCapacityReturnStacksLengthAndNotElementSize(){
        stack.push("12");
        stack.push("10");
        stack.push("90");
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());
        assertEquals(7, stack.capacity());
    }

    @Test
    public void testThatIfIPopCapacityStillRemainsTheSame(){
        stack.push("12");
        stack.push("10");
        stack.push("90");
        assertFalse(stack.isEmpty());
        assertEquals(3, stack.size());
        assertEquals(7, stack.capacity());

        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());
        assertEquals(7, stack.capacity());
    }

    @Test
    public void testThatPopThrowsErrorIfStackIsEmpty(){
        stack.push("obi");
        stack.pop();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void testThatICanLookAtTheElementAtTheBackWithoutRemovingIt(){
        assertTrue(stack.isEmpty());
        stack.push("12");
        stack.push("90");
        stack.push("47");
        assertFalse(stack.isEmpty());
        assertEquals("47", stack.peek());
    }

    @Test
    public void testThatICannotPeekFromAnEmptyStack(){
        assertTrue(stack.isEmpty());
        stack.push("12");
        stack.push("90");
        stack.push("47");
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals("Stack is Empty, no element to see", stack.peek());
    }

}

