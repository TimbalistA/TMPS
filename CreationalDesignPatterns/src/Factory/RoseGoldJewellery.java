package Factory;

public class RoseGoldJewellery extends Jewellery {
    @Override
    public void addGold() {
        System.out.println("Adding gold for Rose Gold Jewellery.");
    }

    @Override
    public void addDiamond() {
        System.out.println("Adding diamonds for Rose Gold Jewellery.");

    }
}
