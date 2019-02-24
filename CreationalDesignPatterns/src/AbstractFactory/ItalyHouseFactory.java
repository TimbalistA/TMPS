package AbstractFactory;

public class ItalyHouseFactory {
    static House buildHouse(HouseType type)
    {
        House house = null;
        switch (type)
        {
            case Cottage:
                house = new HouseCottage(Location.Italy);
                break;

            case Palace:
                house = new HousePalace(Location.Italy);
                break;

            case Villa:
                house = new HouseVilla(Location.Italy);
                break;

            default:
                break;

        }
        return house;
    }
}
