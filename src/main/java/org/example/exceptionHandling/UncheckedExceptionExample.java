package org.example.exceptionHandling;

import java.sql.SQLException;

public class UncheckedExceptionExample {

    public static void main(String[] args) throws SQLException{

        UncheckedExceptionExample uncheckedExceptionExample=new UncheckedExceptionExample();

        uncheckedExceptionExample.m1();

    }

    private void m1() throws SQLException {

       int i=0;

        System.out.println("m1 start");

        m2();

        System.out.println("m1 finish");
    }

    private void m2()  throws SQLException {


        System.out.println("m2 start");

        //throw new ArithmeticException(); // unchecked exception or runtime exception
          throw new SQLException();  // checked exception or compile time exception

    }


}
