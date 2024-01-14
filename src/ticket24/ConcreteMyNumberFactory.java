/*
 * Copyright (c) fl_3650.
 */

package ticket24;

class ConcreteMyNumberFactory implements IAbstractMyNumberFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Rational createRational() {
        return new Rational();
    }
}
