package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightGarage {
    Map<String, Mercedes> map = new HashMap<>();
    Mercedes getMercedes(String color){
        Mercedes mercedes = map.get(color);
        if (mercedes == null){
            mercedes = new Mercedes();
            mercedes.color = color;
            map.put(color, mercedes);
            System.out.println("New color was added");
        }
        return mercedes;
    }
}
