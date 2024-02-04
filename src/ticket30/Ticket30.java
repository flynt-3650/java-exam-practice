/*
 * Copyright (c) Rarmash. https://rarmash.ru
 */

package ticket30;

class Ticket30 {
    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        // If n = 1, it is 2^0 = 1, so return true
        while (n > 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean isPowerOfTwo;
        for (int i = 0; i < 10; i++) {
            isPowerOfTwo = checkPowerOfTwo(i);

            if (isPowerOfTwo)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
