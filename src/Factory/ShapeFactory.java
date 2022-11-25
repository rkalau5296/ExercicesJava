package Factory;

public class ShapeFactory {
    public static Shape createShape(ShapeType type) throws Exception {
        Shape shape;
        switch (type) {
            case Triangle -> shape = new Triangle();
            case Circle -> shape = new Circle();
            case Rectangle -> shape = new Rectangle();
            default -> throw new Exception("Shape type is not handled.");
        }
        return shape;
    }
}
