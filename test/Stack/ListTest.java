package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        list.addTo(1, "chibuzor");
        assertEquals(3, list.size());

//        assertEquals("Ada", list.remove("Ada"));
//        assertEquals(2, list.size());
    }


    @Test
    public void testThatIfInputIsEmptyErrorIsThrownOrNothingHappensToTheSize(){
        assertTrue(list.isEmpty());
        list.addTo(1,"Ada");
        list.add("Obinna");
        list.addTo(0, "chibuzor");
        assertEquals(3, list.size());

        list.remove("");
        assertEquals(3, list.size());
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
    public void tesThatICanRemoveElementViaElement_AndSizeReduces(){
        list.add("obi");
        list.add("ada");
        list.add("obinna");

        list.remove("");
        assertEquals(3, list.size());

    }

    @Test
    public void testThatIfNoElementInList_ReturnEmpty(){
        assertEquals("Empty", list.remove("age"));
        assertEquals(0, list.size());
    }

    @Test
    public void testThatICanRemoveViaIndex_AndSizeReduces(){
        list.add("Emmanuel");
        list.add("Brenda");
        list.add("Christain");
        list.add("Peace");

        list.removeFrom(1);
        list.removeFrom(3);

        assertEquals(2, list.size());

    }


    @Test
    public void testThatICanSetElementsIntoAList(){
        list.set(2, "Emma");
        assertEquals(1, list.size());
    }

    @Test
    public void testThatICanSetToAnIndexGraterThanTheSpecifiedArrayLength(){
        list.set(100, "Emma");
        assertEquals(1, list.size());
    }
//
//    @Test
//    public void testThatICanCheckIfAnElementIsInList(){
//        list.add("Emma");
//        list.add("Flash");
//        list.add("Barry");
//
//        assertEquals(3, list.size());
//        assertEquals(true, list.contains("Flash"));
//    }


