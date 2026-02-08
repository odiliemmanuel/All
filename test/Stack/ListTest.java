package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {

    @Test
    public void testThatListIsEmpty(){
        ListPractice list = new ListPractice();
        assertTrue(list.isEmpty());
    }

}
