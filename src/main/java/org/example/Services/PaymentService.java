package org.example.Services;
import org.example.FactoryMethods.PaymentFactory;
import org.example.PaymentMethods.iPayment;

public class PaymentService {

  public void paymentProcess(PaymentFactory factory, double amount) {
    iPayment payment = factory.createPayment();
    String result = payment.paymentProcessing(amount);
    System.out.println(result + "\n");
  }
}
