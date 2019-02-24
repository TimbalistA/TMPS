package AbstractFactory;

public class HouseVilla extends House {
    HouseVilla(Location location)
    {
        super(HouseType.Villa, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("There is a Villa House");
    }
}
