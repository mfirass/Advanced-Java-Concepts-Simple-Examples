package DataStructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<String, Integer>(4, 0.75f, true);
        phonebook.put("Kevin", 3452);
        phonebook.put("Jill", 9056);
        phonebook.put("Brenda", 566111);
        phonebook.put("Gary", 1000986);
        phonebook.put("Mohammed", 62243);
        System.out.println("Kevin's number: "+ phonebook.get("Kevin"));


        System.out.println("\nList of contacts in phonebook:");
        for (Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }


}
