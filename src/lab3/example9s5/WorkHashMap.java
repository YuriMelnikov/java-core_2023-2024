package lab3.example9s5;

import java.util.HashMap;

public class WorkHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Привет");
        map.put(2, "Мир");
        map.put(3, "!");
        map.put(4, "Hello");
        map.put(5, "World");
        map.put(6, "!");
        map.put(7, "HashMap");
        map.put(8, "Map");
        map.put(9, "JavaCore");
        map.put(10, ")");

        int keys = 1;

        for (Integer key: map.keySet())
        {
            String value = map.get(key);
            if(key > 5) {
                System.out.println("Строки у которых ключ > 5: " + key + "=" + value);
            }
            if(value.length() > 5){
                keys *= key;
            }
        }
        System.out.println("Перемножим все ключи, где длина строки > 5, получим: " + keys);
    }
}
