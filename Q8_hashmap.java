package hello;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
 
class Q8 {
    public static void main(String[] args)
    {
 
        // Declaring the String
        String str = "Alice is girl and Bob is boy boy boy";
        // Declaring a HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap<>();
 
        // Splitting the words of string
        // and storing them in the array.
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer a = hashMap.get(word);
 
            if (a == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hashMap.put(word, 1);
 
            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                hashMap.put(word, a + 1);
            }
        }
        System.out.println(hashMap);
    }
}