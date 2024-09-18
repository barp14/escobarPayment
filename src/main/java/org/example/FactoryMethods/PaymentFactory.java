package org.example.FactoryMethods;

import org.example.PaymentMethods.iPayment;

public abstract class PaymentFactory {
  public abstract iPayment createPayment();
}
