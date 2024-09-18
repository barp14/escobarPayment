package org.example.UtilPack;

public class Util {

  public static boolean creditCardValidator(String cardNumber) {
    return cardNumber != null && cardNumber.matches("\\d{16}");
  }

  public static boolean emailValidator(String paypalEmail){
    return paypalEmail != null && paypalEmail.endsWith("@gmail.com");
  }

  public static boolean amountValidator(double cryptoWallet, double amount){
    return cryptoWallet >= amount;
  }
}
