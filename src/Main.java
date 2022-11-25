import Factory.ShapeFactory;
import Factory.ShapeType;
import Strategy.Coordinate;
import Strategy.Map;
import Strategy.StrategyBike;

public class Main {
    public static void main(String[] args) throws Exception {

        ShapeFactory.createShape(ShapeType.Triangle).Render();

        ShapeFactory.createShape(ShapeType.Circle).Render();

        ShapeFactory.createShape(ShapeType.Rectangle).Render();

        var start = new Coordinate();
        var end = new Coordinate();

        var bikeMap = new Map(new StrategyBike());
        bikeMap.createRoute(start, end);

        var walkMap = new Map(new StrategyBike());
        walkMap.createRoute(start, end);

        var carMap = new Map(new StrategyBike());
        carMap.createRoute(start, end);
    }
}