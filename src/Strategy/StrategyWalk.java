package Strategy;

public class StrategyWalk implements IRouteStrategy{
    @Override
    public void CreateRoute(Coordinate start, Coordinate end)
    {
        System.out.println("Walk strategy");
    }
}
