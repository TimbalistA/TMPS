package Factory;

public class FactoryDesignPattern {
    public static void main(String args[]){
        BaseJewelleryStore jewelleryStore = new JewelleryStore();
        Jewellery roseGoldJewellery = jewelleryStore.createJewellery("rose");
        Jewellery whiteGoldJewellery = jewelleryStore.createJewellery("white");
    }
}
