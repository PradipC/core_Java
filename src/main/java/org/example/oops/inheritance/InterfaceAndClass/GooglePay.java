package org.example.oops.inheritance.InterfaceAndClass;

public class GooglePay implements Payment{


    @Override
    public void transaction() {
        System.out.println("I do transaction with googlePay");
    }

    @Override
    public void checkBalance() {
        System.out.println("This is check balance method from GooglePay");
    }


    public void cashback(){
        System.out.println("For all Customers , we give 20% cashback");
    }


}
