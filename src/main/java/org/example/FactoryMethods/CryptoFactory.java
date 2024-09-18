package org.example.FactoryMethods;
import org.example.PaymentMethods.iPayment;
import org.example.PaymentMethods.PaymentCrypto;

public class CryptoFactory extends PaymentFactory {
  @Override
  public iPayment createPayment() {
    return new PaymentCrypto();
  }
}
