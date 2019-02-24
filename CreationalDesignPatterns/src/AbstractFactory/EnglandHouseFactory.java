package AbstractFactory;

public class EnglandHouseFactory {
    static House buildHouse(HouseType type)
    {
        House house = null;
        switch (type)
        {
            case Cottage:
                house = new HouseCottage(Location.England);
                break;

            case Palace:
                house = new HousePalace(Location.England);
                break;

            case Villa:
                house = new HouseVilla(Location.England);
                break;

            default:
                break;

        }
        return house;
    }
}
