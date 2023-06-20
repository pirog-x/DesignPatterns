package structural.adapter.homework.service;

public interface PaymentGateway {
    void processPayment(String paymentToken, double amount);
    void refundPayment(String paymentToken, double amount);
}
