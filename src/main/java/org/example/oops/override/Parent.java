package org.example.oops.override;

public class Parent {


    // override
    public void m1(){

        System.out.println("This is Pradip");

        isEmailValid(true);

    }


    // overload

    public void m1(int a){

        System.out.println("This is Pradip with number : "+a);

    }


    public void m1(int a,int b){

        System.out.println("This is Pradip with number : "+a+"   and B : "+b);

    }

   // overloading - same method name in same class , But different parameters


    // this will not came in overrding
    private void isEmailValid(boolean isValid){

        System.out.println("This is Private email validation method ");

    }



    // overhidding
    public static void demo(){

        System.out.println("This is Pradip Demo");


    }







}
