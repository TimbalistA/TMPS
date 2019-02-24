package Factory;

public class WhiteGoldJewellery extends Jewellery {
    @Override
    public void addGold() {
        System.out.println("Adding gold for White Gold Jewellery.");
    }

    @Override
    public void addDiamond() {
        System.out.println("Adding diamonds for White Gold Jewellery.");

    }
}
