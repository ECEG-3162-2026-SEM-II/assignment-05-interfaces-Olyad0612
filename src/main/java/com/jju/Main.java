package com.jju;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> payments = new ArrayList<>();

        payments.add(new CreditCard("5105-0051-0510-5105"));
        payments.add(new PayPal("olyad@gmail.com"));

        for (PaymentMethod payment : payments) {
            payment.processPayment(99.99);
        }
    }
}