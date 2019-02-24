package AbstractFactory;

public class HouseCottage extends House {
    HouseCottage(Location location)
    {
        super(HouseType.Cottage, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("There is a Cottage House");
    }
}
