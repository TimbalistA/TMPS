package AbstractFactory;

import java.util.Random;

public class AbstractDesign {
    public static void main(String[] args)
    {
        int random;
        for(int i = 0; i< new Random().nextInt(3) + 1; i++) {
            random = new Random().nextInt(3) + 1;
            switch (random) {
                case 1:
                    System.out.println(HouseFactory.buildHouse(HouseType.Cottage));
                    break;
                case 2:
                    System.out.println(HouseFactory.buildHouse(HouseType.Palace));
                    break;
                default:System.out.println(HouseFactory.buildHouse(HouseType.Villa));
            }
        }
    }
}
