/*
 * Copyright (c) Rarmash. https://rarmash.ru
 */

package ticket28;

class Ticket28 {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int num = 1234567;
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);
    }
}
