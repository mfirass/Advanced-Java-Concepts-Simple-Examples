package Generics;


public class Varargs {

    /**
     * Varargs
     *
     */
    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};
        printShoppingList(shopping);
        System.out.println("\n ------- \n");
        printShoppingList(item2, item1);
    }

    public static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for(String item: items){
            System.out.println(item);
        }
    }




}
