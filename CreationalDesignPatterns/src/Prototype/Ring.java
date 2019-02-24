package Prototype;

public class Ring extends Jewellery {
    public Ring()
    {
        this.jewelleryName = "ring";
    }

    @Override
    void addJewellery()
    {
        System.out.println("Ring jewellery added");
    }

}
