package DataStructures;

import java.util.LinkedList;

public class LinkedListExample {

    /**
     * Each entry also has reference of the previous and the next item
     * Very quick for inserting and removing items from middle of the list
     * ArrayList is faster when we want to get items from the middle of the list
     * ArrayList is recommended if we have to choose between the two
     * If we have a lot of inserting and removing operations then LinkedList is a better solution
     *  */
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
    }
}
