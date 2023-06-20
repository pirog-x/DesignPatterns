package structural.adapter.homework.service;

public interface NewPaymentGateway {
    void initiatePayment(String paymentId, double totalAmount);
    void processTransaction(String transactionId, double amout);
    void cancelTransaction(String transactionId);
}
