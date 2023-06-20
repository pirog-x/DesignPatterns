package structural.adapter.homework;

import structural.adapter.homework.adapter.NewPaymentGatewayAdapter;
import structural.adapter.homework.service.PaymentGateway;

public class PaymentDemo {
    public static void main(String[] args) {
        String paymentToken = "3j99s9fj";
        double amount = 38;

        PaymentGateway paymentGateway = new PaymentGatewayService();
        paymentGateway.processPayment(paymentToken, amount);

        NewPaymentGatewayAdapter adapter = new NewPaymentGatewayAdapter(new NewPaymentGatewayService());
        adapter.processPayment(paymentToken, amount);
    }
}
