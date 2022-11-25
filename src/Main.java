import Factory.ShapeFactory;
import Factory.ShapeType;

public class Main {
    public static void main(String[] args) throws Exception {

        ShapeFactory.createShape(ShapeType.Triangle).Render();

        ShapeFactory.createShape(ShapeType.Circle).Render();

        ShapeFactory.createShape(ShapeType.Rectangle).Render();

    }
}