package Prototype;

public class Necklace extends Jewellery {
    public Necklace()
    {
        this.jewelleryName = "necklace";
    }

    @Override
    void addJewellery()
    {
        System.out.println("Necklace jewellery added");
    }

}
