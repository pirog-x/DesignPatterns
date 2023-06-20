package structural.adapter.homework.adapter;

import structural.adapter.homework.service.NewPaymentGateway;
import structural.adapter.homework.service.PaymentGateway;

public class NewPaymentGatewayAdapter implements PaymentGateway {

    private NewPaymentGateway newPaymentGatewayService;

    public NewPaymentGatewayAdapter(NewPaymentGateway newPaymentGatewayService) {
        this.newPaymentGatewayService = newPaymentGatewayService;
    }

    @Override
    public void processPayment(String paymentToken, double amount) {
       newPaymentGatewayService.initiatePayment(paymentToken, amount);
       newPaymentGatewayService.processTransaction(paymentToken, amount);
    }

    @Override
    public void refundPayment(String paymentToken, double amount) {
        newPaymentGatewayService.cancelTransaction(paymentToken);
    }
}
