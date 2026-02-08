package Bike;

public class Bike {

     static boolean isOn = false;

    static int speed = 0;

    static int gearPosition = 0;




    public static void turnOn(){

       isOn = true;  
    }

    public static void turnOff(){

       speed = 0;

        gearPosition = 0;
       
        isOn = false;        

    }


    public static boolean bikeIsOn(){
      

        return isOn;
    }



    public static void accelerate(){

        if(isOn){

        speedRange();

          speed += gearPosition;
        }
        
    }  





    public static void decelerate(){

        if(isOn){

        speedRange();

          speed -= gearPosition;
       }

    }





    public static int speedRange(){

        if(isOn && speed >= 0 && speed <= 20){
            
            return gearPosition = 1;
        }

       else if(isOn && speed <= 30){

            return gearPosition = 2;
        }


        else if(isOn && speed > 30 && speed < 41    ){

            return gearPosition = 3;
        }
//
       else if(isOn && speed > 40){

            return gearPosition = 4;
        }

        return gearPosition;
    }

        



    public static int getSpeed(){

        return speed;
    }





    public static int getGearPosition(){

        return gearPosition;
    }



    


















}
