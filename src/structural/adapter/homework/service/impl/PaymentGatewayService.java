package structural.adapter.homework.service.impl;

import structural.adapter.homework.service.PaymentGateway;

public class PaymentGatewayService implements PaymentGateway {
    @Override
    public void processPayment(String paymentToken, double amount) {
        System.out.println("Old 'process payment' transaction");
    }

    @Override
    public void refundPayment(String paymentToken, double amount) {
        System.out.println("Old 'refund payment' transaction");
    }
}
