package org.example.PaymentMethods;
import org.example.UtilPack.Console;
import org.example.UtilPack.Util;

public class PaymentCreditCard implements iPayment {

  String cardNumber;

  @Override
  public String paymentProcessing(double amount) {
    cardNumber = Console.readString("Credit card number: ");

    if (Util.creditCardValidator(cardNumber)){
      return("Payment with credit card, $" + amount);
    }
    else {
      return("Card number is invalid.");
    }
  }
}
