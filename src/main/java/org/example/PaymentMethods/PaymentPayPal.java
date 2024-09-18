package org.example.PaymentMethods;

import org.example.UtilPack.Console;
import org.example.UtilPack.Util;

public class PaymentPayPal implements iPayment {

  String paypalEmail;

  @Override
  public String paymentProcessing(double amount) {
    paypalEmail = Console.readString("PayPal email: ");

    if (Util.emailValidator(paypalEmail)){
      return("Payment with PayPal, $" + amount);
    }
    else {
      return("Your email is invalid.");
    }
  }
}
