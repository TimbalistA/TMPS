package Prototype;

import java.util.HashMap;
import java.util.Map;

public class JewelleryStore {
    private static Map<String, Jewellery> jewelleryMap = new HashMap<String, Jewellery>();

    static
    {
        jewelleryMap.put("earring", new Earring());
        jewelleryMap.put("necklace", new Necklace());
        jewelleryMap.put("ring", new Ring());
    }

    public static Jewellery getJewellery(String jewelleryName)
    {
        return (Jewellery) jewelleryMap.get(jewelleryName).clone();
    }
}
