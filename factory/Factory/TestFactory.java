package Factory;

public class TestFactory {
    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.createShape(ShapeType.CIRCLE);
        circle.draw();
        Shape rectangle = factory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}
