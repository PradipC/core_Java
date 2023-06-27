package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class NeedOfCollection {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d =10;
        int e = 33;

        // if we use
        int[]  intArray = new int[10000];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 10;
        intArray[4] = 33;
        intArray[9999] = 90;


        System.out.println(intArray);
        System.out.println("***************");


        String empName1 = "suhas";
        String empName2 = "sachin";
        String empName3 = "virat";

        String[] stringArray = new String[10];
        stringArray[0] = "suhas";
        stringArray[1] = "sachin";
        stringArray[2] = "virat";
        stringArray[3] = "dhoni";
        stringArray[2] = "shubman";


        //stringArray[4] = 876543234;
        //stringArray[5] = 30;
        //stringArray[6] = 78.89f;

        int[] intNewArray = new int[10];
        intNewArray[0] = 876543234;
        intNewArray[1] = 30;



        System.out.println(stringArray);
        System.out.println("***************");


        // limitations
         // array is fixed in the size
         // array is support only homogeneous type / object[] can solve this issue
         // array is not having any ready mate apis / methods . which will help us to insert , delete , sort the array


        Object[] objectArray = new Object[10];
        objectArray[0] = "suhas";
        objectArray[1] = "pradip";
        objectArray[2] = 30;
        objectArray[3] = new Student();


        // collection
             // collection dynamically update the size , so devloper no need to worry about the size
            // hetrogeneous type , becoz it allows all the types
            // collection provided ready mate apis or methods , which will help us to do operations easily

        List list = new ArrayList();
        list.add("sachin");
        list.add("pardip");
        list.add(234);
        list.add(45.56f);
        list.add(new Student());
        list.add(1,"shubhman");

        list.remove(4);

        boolean empty = list.isEmpty();
        System.out.println(empty);


        System.out.println(list);
        list.clear();
        boolean empty1 = list.isEmpty();
        System.out.println(empty1);


    }



}


class Student{



}
