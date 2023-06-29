package org.example.collection;

import java.util.*;

public class ListInterfaceExample {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("suhas");
        list.add("Pradip");
        list.add("sachin");
        list.add("dhoni");
        list.add("sachin");
        list.add("dhoni");


        Set<String> set = new HashSet<>();
        set.add("suhas");
        set.add("Pradip");
        set.add("sachin");
        set.add("dhoni");
        set.add("sachin");
        set.add("dhoni");



        System.out.println(list);
        System.out.println(set);
     // List feature
        // maintaining insertion order
        // maintaining the indexes
        // it allows duplicate records
        // List is interface , for List interfacce - the implementation classes are ArrayList , LinkedList , Vector , Stack

        String name = list.get(2);
        System.out.println(name);


     // ArrayList
         // Initial capacity is 10
         // based on our requirments it will increase the size , becoz it internally used dynamic array data structure
         // we can pass custom initial capacity also for arrayList


        ArrayList arrayList = new ArrayList();


        ArrayList hrTeamList = new ArrayList(50);


        // arraylist few methods

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(5);
        list1.add(7);
        list1.add(1);
        list1.add(3);
        list1.add(10);
        list1.add(100);

        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add(100);
        list2.add(101);
        list2.addAll(list1);
        System.out.println(list2);

        list2.removeAll(list1);
        System.out.println(list2);
        System.out.println(list1);


     // Linked List
          // it internally using doubly linked list data structure , arraylist internally using dynamic array data structure

       List linkedList = new LinkedList();
       linkedList.add("suhas");
       linkedList.add("pradip");

       linkedList.add("sachin");
       linkedList.add("dhoni");

       // it saves memory


       // when we work with huge data
        // and we doing insertion and removing elements mostly , then arraylist decrease the performance
        // linked list requires more space compare to arrayList , becoz it maninating the information of current node and next node
        // becoz arraylist just requires the data and index



        // This is sample text



    }





}
