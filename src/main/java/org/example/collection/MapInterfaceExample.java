package org.example.collection;

import java.util.*;

public class MapInterfaceExample {


    public static void main(String[] args) {


        List list = new ArrayList<>();
        list.add("suhas");
        list.add("dhoni");
        list.add("sachin");
        list.contains("dhoni"); // false


        System.out.println(list);

    // Map -
       // Map is not implement collection interface
        // Map is not store duplicate keys
        // Map is not maintain the insertion order


        Map<String,Integer> map = new HashMap<>();
        map.put("aaa", 12345 );
        map.put("bbb", 3456 );
        map.put("aaa",4567);

       System.out.println(map);

    // pre defined methods

        Map<String,Integer> map11 = new HashMap<>();
        map11.put("abc", 12345 );
        map11.put("bcd", 3456 );
        map11.put("cde",4567);

        System.out.println(map11);

        boolean empty = map11.isEmpty();
        System.out.println("This map is empty : "+empty);

        map11.size();

        Set<String> stringsKey = map11.keySet();
        System.out.println(stringsKey);


        Collection<Integer> values = map11.values();
        System.out.println(values);


        map11.remove("abc");
        System.out.println(map11);

        map11.containsKey("sachin");


        map11.containsValue("india");

        map11.clear();


    // Hashmap -
        // Hashmap not maintain the insertion order
        //  it not allow duplicate
        // it came from Java 1.2
        // default capacity is 16
        // implements Map interface

        Map<String,Integer> map111 = new HashMap<>();
        map11.put("abc", 12345 );
        map11.put("bcd",3456);


        Map<String,List<String>>  map222 = new HashMap<>();






        // Linked HashMap
        // It maintain the insertion order
        //  Duplicate not allow keys
        // This is extending HashMap , also implementating Map interface
        // it came from Java 1.4

         Map<String,String>  linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("sdfgh","dfgh");
        linkedHashMap.put("dfgh","kjhgf");
        linkedHashMap.put("oiuy","oiuygf");
        linkedHashMap.put("dfgh","suhas");

         System.out.println(linkedHashMap);


        // Tree Map
        // It will not allow duplicates
        // insertion order not maintain
        // null is not allow
        // it came from Java 1.2
        // Tree set doing sorting for us


        Map<String,Integer>  treeMap = new TreeMap<>();
        treeMap.put("two",2);
        treeMap.put("akashy",2);
        //treeMap.put(null,2);   // null not allow
        treeMap.put("zebra",2);
        treeMap.put("kite",2);

        System.out.println(treeMap);



    }
}
