package Binary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BinaryConversionTest {



    @Test
    public void testThatMethodReturnsTheResultInReverse(){

        int actual = BinaryConversion.conversionToBinary(-5);

        int expected = 101;

        assertEquals(actual,expected);
    }



    @Test
    public void testThatWhenInputIsNegativeReturnsOriginalValue(){

        int actual = BinaryConversion.conversionToBinary(-10);

        int expected = 1010;

        assertEquals(actual,expected);
    }



    @Test
    public void testThatWhenInputIsZeroResultIsZero(){

        int actual = BinaryConversion.conversionToBinary(0);

        int expected = 0;

        assertEquals(actual,expected);
    }





    @Test
    public void testThatMyMethodExists(){
        
        assertNotNull(BinaryConversion.conversionToBinary(10));
    }




    @Test
    public void testThatMethodsCalculationWorksForReasonableLengthsOfNumbers(){

        int actual = BinaryConversion.conversionToBinary(200);

        int expected = 11001000;

        assertEquals(actual,expected);

    }



    
    @Test
    public void testThatMyMathDotPowerMethodWorks(){

        int actual = BinaryConversion.mathDotPower(2,3);

        int expected = 8;

        assertEquals(actual,expected);
    
    }





    @Test
    public void testThatMyConversionToBaseTenMethodWorks(){

        int actual = BinaryConversion.conversionToBaseTen("1010");

        int expected = 10;

        assertEquals(actual,expected);

    }





    @Test
    public void testThatMyConversionToBaseTenMethodReturnsAnIntegerValueAndNotADouble(){

        int actual = BinaryConversion.conversionToBaseTen("1010");

        int expected = 10;

        assertEquals(actual,expected);
    }
    





}
