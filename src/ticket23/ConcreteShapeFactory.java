/*
 * Copyright (c) fl_3650.
 */

package ticket23;

class ConcreteShapeFactory implements IAbstractShapeFactory {
    @Override
    public Circle createCircle() {
        return new Circle();
    }

    @Override
    public Rectangle createRectangle() {
        return new Rectangle();
    }
}
