package org.pawan.in;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> h = new HashMap<>();
        h.put(101, "John");
        h.put(102, "David");
        h.put(103, "Scott");
        h.put(104, "David");
        h.put(105, "Mary");
        h.put(106, "Tye");
        h.put(103, "X");
        h.put(107, "David");
        h.remove(103);
        System.out.println(h.get(104));

        System.out.println(h);

        System.out.println(h.containsKey(104));
        System.out.println(h.containsKey(103));
        System.out.println(h.containsValue("Paw"));
        boolean empty = h.isEmpty();
        System.out.println(empty);
        System.out.println(h.keySet());

        for (int i : h.keySet()) {
            System.out.println(i);
        }
        System.out.println(h.values());
        for (String i : h.values()) {
            System.out.println(i);
        }

        for(int i:h.keySet()){
            System.out.println(i + " " + h.get(i));
        }

        System.out.println("ENTRY SPECIFIC METHODS");
        for (Map.Entry e:h.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}