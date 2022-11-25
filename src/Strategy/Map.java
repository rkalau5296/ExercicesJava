package Strategy;

public class Map {
    private final IRouteStrategy iRouteStrategy;

    public Map(IRouteStrategy iRouteStrategy){
        this.iRouteStrategy = iRouteStrategy;
    }

    public void createRoute(Coordinate start, Coordinate end)
    {
        iRouteStrategy.CreateRoute(start, end);
    }
}
