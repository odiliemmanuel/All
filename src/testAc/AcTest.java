package testAc;

import Java.christmas.decemberTask3.Ac.Ac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AcTest{




    @Test
    public void testThatAcCanTurnOn(){

        Ac myAc = new Ac();

        myAc.turnOn();
        
        boolean actual = myAc.acIsOn();

        boolean expected = true;

        assertEquals(expected, actual);
    }



    @Test
    public void testThatAcCanTurnOff(){

        Ac myAc = new Ac();

        myAc.turnOff();

        boolean actual = myAc.acIsOn();

        boolean expected = false;

        assertEquals(expected, actual);
    }


    @Test
    public void testThatAcCanIncreaseWhenOn(){

        Ac myAc = new Ac();

        myAc.turnOn();

        int temperature = myAc.getTemperature();

        assertEquals(16, temperature);

        myAc.increaseTemperature();

        int temperatureTwo = myAc.getTemperature();

        assertEquals(17, temperatureTwo);
    }


    @Test
    public void testThatAcCannotIncreaseWhenOff(){

        Ac myAc = new Ac();

        myAc.turnOn();

        int temperature = myAc.getTemperature();
        assertEquals(16, temperature);

        myAc.turnOff();

        myAc.increaseTemperature();

        int temperatureTwo = myAc.getTemperature();

        assertEquals(16, temperatureTwo);

        
    }


    
    @Test
    public void testThatAcCannotDecreaseWhenOn(){

        Ac myAc = new Ac();

        myAc.turnOn();

        int temperature = myAc.getTemperature();

        assertEquals(16, temperature);

        myAc.decreaseTemperature();

        int temperatureTwo = myAc.getTemperature();

        assertEquals(15, temperatureTwo);
    }








}
