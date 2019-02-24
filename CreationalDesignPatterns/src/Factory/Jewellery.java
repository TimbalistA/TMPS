package Factory;

public abstract class Jewellery {
    public abstract void addGold();
    public abstract void addDiamond();

    public void makeJewellery() {
        System.out.println("Jewellery will be ready in 2 days.\n");
    }
}
