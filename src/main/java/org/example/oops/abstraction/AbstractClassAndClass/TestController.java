package org.example.oops.abstraction.AbstractClassAndClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestController {

    public static void main(String[] args) {


        Payment payment = new GooglePayImpl();
        payment.checkBalance();
        payment.creditMoney();
        payment.debitMoney();


        List list = new ArrayList();

        List list1 = new LinkedList();





    }


}
