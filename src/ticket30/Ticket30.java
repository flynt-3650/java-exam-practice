/*
 * Copyright (c) Rarmash. https://rarmash.ru
 */

package ticket30;

class Ticket30 {
    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        // Если число равно 1, то это 2^0 = 1, поэтому вернем true
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPowerOfTwo;
        // Проверяем от 0 до 9 включительно.
        for (int i = 0; i < 10; i++) {
            int N = i; // Для удобства; redundant.
            isPowerOfTwo = checkPowerOfTwo(N);
            if (isPowerOfTwo) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
