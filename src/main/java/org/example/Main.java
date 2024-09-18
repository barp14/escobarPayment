package org.example;
import org.example.FactoryMethods.CreditCardFactory;
import org.example.FactoryMethods.CryptoFactory;
import org.example.FactoryMethods.PayPalFactory;
import org.example.Services.PaymentService;
import org.example.UtilPack.Console;

public class Main {
  public static void main(String[] args) {

    int choice;

    PaymentService service = new PaymentService();

    do {
      double amount = Console.readDouble("Payment amount: ");

      System.out.println("\nChoose an option: ");
      System.out.println("1 - Pay with credit card");
      System.out.println("2 - Pay with PayPal");
      System.out.println("3 - Pay with Crypto");
      System.out.println("4 - Exit");
      choice = Console.readInt("\nYour choice: ");

      switch (choice) {
        case 1:
          service.paymentProcess(new CreditCardFactory(), amount);
          break;

        case 2:
          service.paymentProcess(new PayPalFactory(), amount);
          break;

        case 3:
          service.paymentProcess(new CryptoFactory(), amount);
          break;

      }
    } while (choice != 4);
  }
}