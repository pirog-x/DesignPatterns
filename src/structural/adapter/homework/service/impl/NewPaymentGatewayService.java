package structural.adapter.homework.service.impl;

import structural.adapter.homework.service.NewPaymentGateway;

public class NewPaymentGatewayService implements NewPaymentGateway {
    @Override
    public void initiatePayment(String paymentId, double totalAmount) {
        System.out.println("Do init payment");
    }

    @Override
    public void processTransaction(String transactionId, double amout) {
        System.out.println("Do process transaction");
    }

    @Override
    public void cancelTransaction(String transactionId) {
        System.out.println("Do cancel transaction");
    }
}
