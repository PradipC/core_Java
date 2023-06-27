package org.example.oops.abstraction.InterfaceAndClass;

public class PaymentImpl implements Payment  {


    @Override
    public void checkBalance() {
        // any code
        System.out.println("This is check balance from Implementation class ");
    }

    @Override
    public void creditMoney() {
        System.out.println("This is creditMoney from Implementation class ");

    }

    @Override
    public void debitMoney() {
        System.out.println("This is debitMoney from Implementation class ");
    }


}
