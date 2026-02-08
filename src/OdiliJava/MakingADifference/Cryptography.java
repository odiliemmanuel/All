    public class Cryptography {
        public static void main(String...Odili) {
//
//        int number = 4567;
//        encryptedValue(number);
//        int number = 3412;
//        decryptedValue(number);

//        int number = 7984;
//        encryptedValue(number);
        int number = 5146;
        decryptedValue(number);

        }

                public static void encryptedValue(int number){

                    int encryptedNumber = 0;
                    int calculate = 0;
                    int division = 0;
                    
                    String num = Integer.toString(number);

                    for(int count = 0; count < num.length(); count ++) {
                        
                        int digit = num.charAt(count) - 48;

                        calculate = digit + 7;
                        division = calculate % 10;
                        encryptedNumber = encryptedNumber * 10 + division;
                       
                    }
                   
                    String divide = Integer.toString(encryptedNumber);
                    
                    char [] swap = divide.toCharArray();
            
                     char temp1 = swap[0];
                     swap[0] = swap[2];
                     swap[2] = temp1;
                    
                     char temp2 = swap[1];
                     swap[1] = swap[3];
                     swap[3] = temp2;


                    int encrypted = Integer.parseInt(new String(swap));

                    System.out.println(encrypted);

                }
     

                
                public static void decryptedValue(int number) {

                    int encryptedNumber = 0;
                    int calculate = 0;
                    int division = 0;

                    String divide = Integer.toString(number);

                    char [] swap = divide.toCharArray();
            
                     char temp1 = swap[2];
                     swap[2] = swap[0];
                     swap[0] = temp1;
                    
                     char temp2 = swap[3];
                     swap[3] = swap[1];
                     swap[1] = temp2;


                    int encrypted = Integer.parseInt(new String(swap));


                    
                    String num = Integer.toString(encrypted);

                    for(int count = 0; count < num.length(); count ++) {
                        
                        int digit = num.charAt(count) - 48;

                        calculate = digit * 10 / 10;
                        division = 7 - calculate;
                        encryptedNumber = encryptedNumber * 10 + division;
                       
                    }

                    System.out.println(encryptedNumber);
                   
                    

             }
                    


            

            

        
    }
