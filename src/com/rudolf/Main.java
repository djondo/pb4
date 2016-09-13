package com.rudolf;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        

      // Create scanner to read the card number
        Scanner numberScanner = new Scanner(System.in);
        // ask user to enter a number
        System.out.println("Enter a valid credit card number: ");
        String cardNumber = numberScanner.nextLine();
        //create method
        boolean isValid = isVisaCreditCardNumberValid(cardNumber);
        // condition for the method
        if (isValid) {
            System.out.println("Credit card number is valid");
        } else {
            System.out.println("Credit card number is not valid");


        }
    }
        // method call
    private static boolean isVisaCreditCardNumberValid(String cardNumber) {
        if (!cardNumber.startsWith("4") || (cardNumber.length() != 16)) {
            System.out.println("should start by 4, incorrect length");
            return false;
        }
        return true;
    }
}

