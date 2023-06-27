package org.example.oops.inheritance.InterfaceAndClass;

public interface Payment {


     void transaction();

     void checkBalance();


     default void cashback(){
          System.out.println("For all Customers , we give 10% cashback");
     }


     default void giveCoupon(){
          System.out.println("For all Customers , we give 1 coupan monthly");
     }

     static void information(){
          System.out.println("This is Payment gateway , we use to Payment the customer");
     }


}
