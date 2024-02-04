/*
 * Copyright (c) fl_3650.
 */

package ticket3;

import java.util.*;

class Ticket3 {
    public static boolean isUnique(Map<String, String> map) {
        Set<String> uniqueValues = new HashSet<>();

        for (var value : map.values())
            if (!uniqueValues.add(value))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<>();
        m1.put("key1", "value1");
        m1.put("key2", "value2");
        m1.put("key3", "value3");
        System.out.println(isUnique(m1));

        Map<String, String> m2 = new TreeMap<>();
        m2.put("key1", "value1");
        m2.put("key2", "value2");
        m2.put("key3", "value2");
        System.out.println(isUnique(m2));
    }
}
