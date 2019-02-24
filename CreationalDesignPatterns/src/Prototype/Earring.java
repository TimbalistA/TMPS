package Prototype;

public class Earring extends Jewellery {
    public Earring()
    {
        this.jewelleryName = "earring";
    }

    @Override
    void addJewellery()
    {
        System.out.println("Earring jewellery added");
    }

}
