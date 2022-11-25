package Strategy;

public class StrategyCar implements IRouteStrategy{
    @Override
    public void CreateRoute(Coordinate start, Coordinate end)
    {
        System.out.println("Car strategy");
    }
}
