package Factory;

public class JewelleryStore extends BaseJewelleryStore{
    @Override
    public  Jewellery createJewellery(String type){
        Jewellery jewellery;
        switch (type.toLowerCase())
        {
            case "rose":
                jewellery = new RoseGoldJewellery();
                break;
            case "white":
                jewellery = new WhiteGoldJewellery();
                break;

            default: throw new IllegalArgumentException("No such Jewellery.");
        }

        jewellery.addGold();
        jewellery.addDiamond();
        jewellery.makeJewellery();
        return jewellery;
    }
}
