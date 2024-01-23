package newticket16;

class Money {
    private long rubles;
    private double kopecks;

    public Money(long rubles, double kopecks) {
        this.rubles = rubles;
        this.kopecks = kopecks;
    }

    public Money add(Money other) {
        return new Money(this.rubles + other.rubles, this.kopecks + other.kopecks);
    }

    public Money subtract(Money other) {
        return new Money(this.rubles - other.rubles, this.kopecks - other.kopecks);
    }

    public Money divide(long divisor) {
        return new Money(this.rubles / divisor, this.kopecks / divisor);
    }

    public Money divide(double divisor) {
        return new Money((long) (this.rubles / divisor), this.kopecks / divisor);
    }

    public Money multiply(double factor) {
        return new Money((long) (this.rubles * factor), this.kopecks * factor);
    }

    public boolean isEqual(Money other) {
        return this.rubles == other.rubles && this.kopecks == other.kopecks;
    }

    public boolean isGreater(Money other) {
        return this.rubles > other.rubles || (this.rubles == other.rubles && this.kopecks > other.kopecks);
    }

    public boolean isLess(Money other) {
        return this.rubles < other.rubles || (this.rubles == other.rubles && this.kopecks < other.kopecks);
    }

    @Override
    public String toString() {
        return rubles + "," + String.format("%.2f", kopecks);
    }
}
