package Mapインタフェース;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map.toString());
        System.out.println(map.get(1));

        map.remove(1);
        System.out.println(map.toString());
    }
}
