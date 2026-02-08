package Bike;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RunBikeTest {




    @Test
   void testThatBikeCanTurnOn(){
       

        Bike.turnOn();

        boolean expected = true;

        boolean actual  = Bike.bikeIsOn();

        assertEquals(expected, actual);
    }


    @Test
    public void testThatBikeCanTurnOff(){

        Bike.turnOff();

        boolean actual = Bike.bikeIsOn();

        boolean expected = false;

        assertEquals(expected, actual);
    }



    @Test
    public void testThatBikeCanAccelerateWhenOn(){

        Bike.turnOn();

        int speedOne = Bike.getSpeed();

        assertEquals(4, speedOne);

        Bike.accelerate();

        assertEquals(5,Bike.getSpeed());
       assertEquals(1,Bike.getGearPosition());

    }


    

    @Test
    public void testThatBikeCannotAccelerateWhenOff(){

        Bike.turnOn();

        Bike.accelerate();

        Bike.accelerate();

        int currentSpeed = Bike.getSpeed();

        assertEquals(2, currentSpeed);

        Bike.turnOff();

        currentSpeed = Bike.getSpeed();
        
//        System.out.println("The Current Speed is: " + currentSpeed);

        assertEquals(0, currentSpeed);

     }



    @Test
    public void testThatWhenSpeedCrossAGivenRangeAndGearChanges() {


        Bike.turnOn();

        int speedOne = Bike.getSpeed();
        int gearOne = Bike.getGearPosition();

        assertEquals(0, speedOne);
        assertEquals(0, gearOne);

        Bike.turnOff();
        Bike.turnOn();
            Bike.accelerate();
            Bike.accelerate();
            Bike.accelerate();
            Bike.accelerate();

          assertEquals(4, Bike.getSpeed());




    }



}
