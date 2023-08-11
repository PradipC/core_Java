package org.example.exceptionHandling;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ExceptionHandlingExample {

    public static void main(String[] args) {


        TreeSet treeSet = new TreeSet();
        treeSet.add("suhas");
        treeSet.add("psuhas");
        treeSet.add("asuhas");
        treeSet.add("zuhas");
        treeSet.add("asuhas");
        treeSet.add("csuhas");

        try {
            treeSet.add(null);
        }catch(NullPointerException npe){
            System.out.println("I handled the exception here");
        }

        treeSet.add("hsuhas");
        treeSet.add("msuhas");
        treeSet.add("jsuhas");
        treeSet.add("osuhas");


        System.out.println(treeSet);


        List list = new ArrayList();
        list.add("suhas");

       // list.get(2);

        System.out.println("list : "+list);


        try {
            int i = 10 / 0;
            System.out.println(" -------- Pradip --------");
            System.out.println(i);
        }catch (NullPointerException e){
            System.out.println("We handled divide by zero exception here in catch block");
        }



     // Q. what is exception ?
        //  --> Exception is an event , that stop / disrupts the flow of the program
          //It is an object which is thrown at runtime

     // benefits of exception handling
        // if we handle exception , then it will not terminate our program . and we can finish our flow


     // Types of Exceptions
        //1 . Error
        //2 .CheckedException
        //3. UncheckedException


      // 1. Error -
          // Error came on system level , Developer cannot handle it .
          // e.g StackoverflowError - when heap area full


      // 2. Checked Exception / Compile Time exception -
         // The class which extending from Exception class  ( except RuntimeException )
         // e.g SQLException , FileNotFoundexception , IOException , ClassNotFoundException
        // checkedException came from code , so developer can handle it


      //3.  Unchecked Exception / Runtime exception
         // The class which is extending directly from RuntimeException
          // e.g NullPointerException , IndexOutOfBoundexception , ArithMatichException
        // uncheckedException came from code , so developer can handle it
    }


}
