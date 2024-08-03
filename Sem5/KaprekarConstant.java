package Sem5;

import java.util.Arrays;

public class KaprekarConstant {
    public static void main(String[] args) {
        int number = 1234; // You can choose any non-negative integeR
        while (number != 6174) {
            int[] digits = getDigits(number);
            Arrays.sort(digits); // Ascending order
            int ascending = digitsToNumber(digits);
            Arrays.sort(digits); // Descending order
            int descending = digitsToNumber(reverseArray(digits));

            number = Math.abs(ascending - descending);
            System.out.println("Step: " + number);
        }

        System.out.println("Kaprekar constant reached!");
    }

    // Helper method to convert an array of digits to an integer
    private static int digitsToNumber(int[] digits) {
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }

    // Helper method to reverse an array
    private static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Helper method to extract individual digits from a number
    private static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
}
