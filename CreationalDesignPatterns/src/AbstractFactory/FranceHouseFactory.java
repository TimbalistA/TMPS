package AbstractFactory;

public class FranceHouseFactory {
    static House buildHouse(HouseType type)
    {
        House house = null;
        switch (type)
        {
            case Cottage:
                house = new HouseCottage(Location.France);
                break;

            case Palace:
                house = new HousePalace(Location.France);
                break;

            case Villa:
                house = new HouseVilla(Location.France);
                break;

            default:
                break;

        }
        return house;
    }
}
