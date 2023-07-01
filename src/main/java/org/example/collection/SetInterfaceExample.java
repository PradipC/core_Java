package org.example.collection;

import java.util.*;

public class SetInterfaceExample {

    public static void main(String[] args) {


   //Set -
    // Insertion order is not maintain
    // it not allowing duplicate records
    // implementation classes Hashset , LinkedHashSet , treeset

        List<String> list = new LinkedList<>();
        list.add("suhas");
        list.add("Pradip");
        list.add("sachin");
        list.add("dhoni");
        list.add("sachin");
        list.add("dhoni");


        System.out.println(list);


        Set<String> set = new HashSet<>();
        set.add("suhas");
        set.add("Pradip");
        set.add("sachin");
        set.add("dhoni");
        set.add("sachin");   // duplicate not allowed
        set.add("dhoni");
        set.add(null);
        set.add(null);   // allow only once



        System.out.println(set);


     //   Hashset  -
          // hashset not maintain the insertion order
          //  it not allow duplicate
          // it came from Java 1.2
          // default capacity is 16
          // it internally used Hashmap to store element


        Set set1 = new HashSet();
        set1.add("suhas");
        set1.add("Pradip");
        set1.add("sachin");
        set1.add("dhoni");
        set1.add("sachin");   // duplicate not allowed
        set1.add("dhoni");
        set1.add(null);
        set1.add(null);   // allow only once

        System.out.println(set1);

    // Linked Hashset
          // It maintain the insertion order
          //  Duplicate not allow
          // This is extending Hashset , also implementating Set interface
          // it came from Java 1.4
          // it internnally used LinkedHashMap

        Set set2 = new LinkedHashSet();
        set2.add("suhas");
        set2.add("Pradip");
        set2.add("sachin");
        set2.add("dhoni");
        set2.add("sachin");   // duplicate not allowed
        set2.add("dhoni");
        set2.add(null);
        set2.add(null);   // allow only once


        System.out.println(set2);


     // Tree set
        // It will not allow duplicates
        // insertion order not maintain
        // null is not allow
        // it internally using treeMap
        // it came from Java 1.2
        // Tree set doing sorting for us

        Set<String> set3 = new TreeSet();
        set3.add("suhas");
        set3.add("zebra");
        set3.add("Pradip");
        set3.add("sachin");
        set3.add("kumar");
        set3.add("dhoni");
        set3.add("sachin");   // duplicate not allowed
        set3.add("dhoni");
        set3.add("Akshay");


        System.out.println(set3);




    }


}
