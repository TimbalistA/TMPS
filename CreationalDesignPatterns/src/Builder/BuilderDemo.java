package Builder;

public class BuilderDemo {
    public static void main(String args[])
    {
        Jewellery jewellery = new Jewellery.JewelleryBuilder(
                1, "ring","rose").build();
        System.out.println("Id - "+jewellery.getId()+" Type - "+jewellery.getType()+" Gold - "+jewellery.getGold());
    }
}
