package Ticket24;

public class Factory {
    public Complex createComplex() {
        return new Complex();
    }

    public Rational createRational() {
        return new Rational();
    }
}
