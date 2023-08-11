package org.example.exceptionHandling;

public class ThrowAndThrowsExample {


    public static void main(String[] args)  {

        ThrowAndThrowsExample throwAndThrowsExample=new ThrowAndThrowsExample();
        try {
            throwAndThrowsExample.m1();  // throw reached here
        }catch (ArithmeticException e){
            System.out.println("Exception hanlded at main method ");
        }
    }


    public void m1() throws ArithmeticException {
        System.out.println("This is my m1 non static method start ");
        try{
           m2();  // throw new ArithmaticException
        }catch (ArithmeticException e){
            System.out.println("Exception hanlded at m1 method ");
        }
        System.out.println("This is my m1 non static method finish ");
    }


    public void m2()  throws  ArithmeticException{

        System.out.println("This is my m2 method start ");

        //int i = 10/0; //

        throw new ArithmeticException();


    }


}
