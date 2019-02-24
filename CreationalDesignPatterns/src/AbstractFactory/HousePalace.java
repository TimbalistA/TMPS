package AbstractFactory;

public class HousePalace extends House {
    HousePalace(Location location)
    {
        super(HouseType.Palace, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("There is a Palace House");
    }
}
