package com.epam.training.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {
        // Set
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(3);

        for (int i : set) {
            System.out.println(i);
        }

        // List
        List<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        for (String s : list) {
            System.out.println(s);
        }

        // Map
        Map<String, String> map = new HashMap<String, String>();
        map.put("First name", "Emily");
        map.put("Last name", "Smith");
        map.put("City", "Szeged");

        System.out.println("First name: " + map.get("First name"));

        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }

    }

}
