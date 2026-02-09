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
        assertEquals(2, list.size());
    }

    @Test
    public void testThatICanAddANewElementViaSpecificationOfIndex(){
        assertTrue(list.isEmpty());
        list.addTo(1,"Ada");
        list.add("Obinna");
        assertEquals(2, list.size());
    }

    @Test
    public void testThatWhenIRemoveAnElement_SizeReduces(){
        assertTrue(list.isEmpty());
        list.addTo(1,"Ada");
        list.add("Obinna");
        list.addTo(0, "chibuzor");
        assertEquals(3, list.size());

        list.remove("Ada");
        assertEquals(2, list.size());
    }

    @Test
    public void testThatIfInputIsEmptyErrorIsThrown(){
        assertTrue(list.isEmpty());
        list.addTo(1,"Ada");
        list.add("Obinna");
        list.addTo(0, "chibuzor");
        assertEquals(3, list.size());

        list.remove("");
        assertEquals(2, list.size());
    }

    @Test
    public void testThatIfIAddAndReachMaximumLength_LengthIncreases(){
        list.add("obi");
        list.add("ada");
        list.add("obi");
        list.add("ada");
        list.add("obi");
        list.add("ada");
        assertEquals(6, list.size());
    }

    @Test
    public void tesThatICanRemoveElementViaIndex(){
        list.add("obi");
        list.add("ada");
        list.add("obinna");

//        list.removeFrom(1);
        assertEquals(2, list.size());
    }

}
