package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    /**
     *      Generic methods example
     *
     */
     static Character[] charArray = {'h', 'u', 'l'};
     static Integer[] intArray = {1,2,3,5};
     static Boolean[] boolArray = {true, false, true};

     public static <T> List<T> arrayToList(T[] array, List<T> list){
     for (T object : array){
     list.add(object);
     }
     return list;
     }

     public static void main(String[] args) {
     List<Character> charList = arrayToList(charArray, new ArrayList<>());
     List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
     List<Integer> intList = arrayToList(intArray, new ArrayList<>());

     }


}
