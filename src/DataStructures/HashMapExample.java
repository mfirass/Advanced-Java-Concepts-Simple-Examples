package DataStructures;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        /**
         * HashMap is unordered
         * Don't allow duplicate keys
         * Allow to have null as a key
         * U can check if ur HashMap contains a key by the method containsKey(key)
         * Add entry by: put(key, value)
         * Remove entry by: remove(key)
         * Remove all entries by: clear()
         * */
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 3452);
        phonebook.put("Jill", 9056);
        phonebook.put("Brenda", 566111);
        phonebook.put("Gary", 1000986);
        phonebook.put("Mohammed", 62243);
        System.out.println(phonebook);
    }
}
