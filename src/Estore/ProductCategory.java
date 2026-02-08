package Estore;

public enum ProductCategory {
    ELECTRONICS,
    GROCERIES,
    UTENSILS,
    CLOTHING
    ;

    private final String[] names;

    ProductCategory(String...name){
        this. names = name;
    }

}
