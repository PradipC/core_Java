package org.example.oops.inheritance.InterfaceAndClass;

public class PhonePay implements Payment{


    public void checkBalance(){
        System.out.println("This is check balance method from PhonePay");
    }

    public static void m1(){
        System.out.println("This is static m1 from PhonePay");
    }



    @Override
    public void transaction() {
        System.out.println("I do transaction with PhonePay");
    }
}
