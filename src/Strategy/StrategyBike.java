package Strategy;

public class StrategyBike implements IRouteStrategy{
    @Override
    public void CreateRoute(Coordinate start, Coordinate end)
    {
        System.out.println("Bike strategy");
    }
}
