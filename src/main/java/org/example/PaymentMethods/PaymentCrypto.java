package org.example.PaymentMethods;

import org.example.UtilPack.Console;
import org.example.UtilPack.Util;

public class PaymentCrypto implements iPayment {

  double paypalWallet;

  @Override
  public String paymentProcessing(double amount) {
    paypalWallet = Console.readDouble("Crypto wallet value: ");

    if (Util.amountValidator(paypalWallet, amount)){
      return("Payment with Crypto, $" + amount);
    }
    else {
      return("Insufficient amount in your Crypto Wallet.");
    }  }
}
