package AbstractFactory;

import java.util.Random;

public class HouseFactory {
    private HouseFactory()
    {

    }
    public static House buildHouse(HouseType type)
    {
        House house = null;
        Location location = null;
        int random = new Random().nextInt(3) + 1;

        switch (random) {
            case 1:
                location = Location.Italy;
                break;
            case 2:
                location = Location.England;
                break;
            default: location = Location.France;
        }

        switch(location)
        {
            case England:
                house = EnglandHouseFactory.buildHouse(type);
                break;

            case Italy:
                house = ItalyHouseFactory.buildHouse(type);
                break;

            default:
                house = FranceHouseFactory.buildHouse(type);

        }

        return house;

    }
}
