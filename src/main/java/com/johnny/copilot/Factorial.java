package com.johnny.copilot;
import java.math.BigInteger;
/**
 * Class to calculate the factorial of a number.
 */
public class Factorial {

    /**
     * Calculates the factorial of a given number.
     *
     * @param number the number to calculate the factorial of
     * @return the factorial of the number
     * @throws IllegalArgumentException if the number is less than 0
     */
    public BigInteger calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be greater than or equal to 0");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    /**
     * Main method to test the calculateFactorial method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int number = 98765; // Changed to a non-negative number
        BigInteger result = factorial.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}