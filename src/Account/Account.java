package Account;

public class Account {
    private int balance;
    private String PIN = "4567";

    public int checkBalance() {

        return balance;
    }


    public int deposit(int amount) {
        if(amount >= 50){
            balance = balance + amount;
        }

        return balance;
    }


    public boolean validatePin(String pin){
        return this.PIN.equals(pin);

    }

    public int withdraw(int amount, String pin) {
        if(!validatePin(pin)){
            return balance;
        }
        if(amount >= 500 && amount <= balance) {
            balance = balance - amount;
        }


        return balance;

    }



    public int transfer(int amount, String pin) {
        if(validatePin(pin) && amount <= balance && amount >= 50) {
            balance = balance - amount;
        }

        return balance;
    }
}
