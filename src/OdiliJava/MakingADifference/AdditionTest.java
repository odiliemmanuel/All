
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AdditionTest {


    @Test
    public void testForAdditionOfNumbers(){

        int actual = Addition.sumOf(1);

        int expected = 2;

        Assertions.assertEquals(actual,expected);
    }



}



