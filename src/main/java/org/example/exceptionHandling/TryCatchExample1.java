package org.example.exceptionHandling;

public class TryCatchExample1 {

    public static void main(String[] args) {



         // try , catch , finally , throw , throws


      // try , catch , finally -
          // This all things we write inside method only
         // Try will always require either catch or finally , It will not work individual
        //  we can add multiple catch block also with try
        //  all catch block handle in ordered , with most specific to most general

        System.out.println("Code 00 -- ");

        try{
            System.out.println("India");
            int i= 10/0;  // ArithmaticException
            System.out.println("USA");


        }catch (ArithmeticException e){
            System.exit(0);
            // e.printStackTrace();
            System.out.println("UK");
            System.out.println("exception is : "+e.getMessage());
        }finally {
            System.out.println("This is finally block and it always excute ");
        }


        System.out.println("Code 11 -- ");
        System.out.println("Code 22 -- ");
        System.out.println("Code 33 -- ");
        System.out.println("Code 44 -- ");
        System.out.println("Code 55 -- ");




    }



}
