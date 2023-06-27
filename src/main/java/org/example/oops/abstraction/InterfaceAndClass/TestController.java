package org.example.oops.abstraction.InterfaceAndClass;

public class TestController {


    public static void main(String[] args) {

        Payment payment = new PaymentImpl();
        payment.checkBalance();
        payment.creditMoney();
        payment.debitMoney();


    }


}
