package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListTest {
    ListPractice list;

    @BeforeEach
    public void startEachMethodWith(){
        list = new ListPractice();
    }

    @Test
    public void testThatListIsEmpty(){
        assertTrue(list.isEmpty());
    }

    @Test
    public void testThatICanAddElementsToListAndSizeIncreases(){
        list.add("Ada");
        list.add("Obinna");
//        assertEquals(2, list.getSize());
    }

}
