package Estore;

public enum CardType {
    MASTER_CARD,
    VISA_CARD,
    VERVE,
    AMERICA_EXPRESS;

    private final String[] names;

    CardType(String...name){
        this.names = name;
    }


}