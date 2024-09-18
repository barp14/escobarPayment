package org.example.FactoryMethods;
import org.example.PaymentMethods.iPayment;
import org.example.PaymentMethods.PaymentPayPal;

public class PayPalFactory extends PaymentFactory {
  @Override
  public iPayment createPayment() {
    return new PaymentPayPal();
  }
}
