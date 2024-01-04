package Ticket23;

public class ShapeFactory {
    public Circle createCircle() {
        return new Circle();
    }

    public Rectangle createRectangle() {
        return new Rectangle();
    }
}
