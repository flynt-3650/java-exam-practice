/*
 * Copyright (c) fl_3650.
 */

package ticket2;

import java.util.*;

class Ticket2 {
    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();

        for (var item : map.keySet()) {
            result.put(map.get(item), item);
        }

        return result;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");

        Map<String, Integer> newMap = reverse(hashMap);

        for (var item : newMap.keySet()) {
            System.out.println(item + " " + newMap.get(item));
        }
    }
}
