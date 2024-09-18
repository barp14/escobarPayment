package org.example.FactoryMethods;
import org.example.PaymentMethods.iPayment;
import org.example.PaymentMethods.PaymentCreditCard;

public class CreditCardFactory extends PaymentFactory {
  @Override
  public iPayment createPayment() {
    return new PaymentCreditCard();
  }
}
