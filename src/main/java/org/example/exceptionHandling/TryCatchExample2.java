package org.example.exceptionHandling;

import java.beans.IndexedPropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

public class TryCatchExample2 {

    public static void main(String[] args) {



        System.out.println("This is my line 00 ");

        try {

            int i = 10/0;  // Arithmatic

            String name = "suhas";
            name = name.toUpperCase();

            System.out.println("name is : " + name);


             List list = new ArrayList<>();
             list.get(0);  // IndexOfBoundException

        }catch (ArithmeticException e){
            System.out.println("11 Exception is : "+e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println("22 Exception is : "+e.getMessage());
        }catch (Exception e){
            System.out.println("33 Exception is : "+e.getMessage());
        }finally {

            // suppose after coming error , or without coming any error
            // if you want to execute any line / code .then You can add inside finally
            // becoz finally block execute always - with error / without error
            System.out.println("This line always execute ");

            System.out.println("  == This is mandatory code == ");

        }





        System.out.println("This is my next line 11 ");



    }



}
