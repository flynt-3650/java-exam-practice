/*
 * Copyright (c) fl_3650.
 */

package newticket16;

class Tester {
    public static void main(String[] args) {
        Money money1 = new Money(10, 50.75);
        Money money2 = new Money(5, 25.50);

        Money sum = money1.add(money2);
        Money difference = money1.subtract(money2);
        Money division = money1.divide(2);
        Money divisionByFraction = money1.divide(2.5);
        Money multiplication = money1.multiply(1.5);

        System.out.println("Money 1: " + money1);

        System.out.println("Money 2: " + money2);

        System.out.println("Sum: " + sum);

        System.out.println("Difference: " + difference);

        System.out.println("Division by 2: " + division);

        System.out.println("Division by 2.5: " + divisionByFraction);

        System.out.println("Multiplication by 1.5: " + multiplication);

        System.out.println("Comparison: ");
        System.out.println("Is money1 equal to money2? " + money1.isEqual(money2));
        System.out.println("Is money1 greater than money2? " + money1.isGreater(money2));
        System.out.println("Is money1 less than money2? " + money1.isLess(money2));
    }
}
