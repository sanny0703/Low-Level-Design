package Factory;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    public Shape createShape(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            default -> new Rectangle();
        };

    }
}
