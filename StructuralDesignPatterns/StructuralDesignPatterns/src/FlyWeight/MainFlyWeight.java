package FlyWeight;

public class MainFlyWeight {
    public static void main(String[]args){
        FlyWeightGarage flyWeightGarage = new FlyWeightGarage();
        Mercedes mercedes = flyWeightGarage.getMercedes("red");
        Mercedes mercedes1 = flyWeightGarage.getMercedes("red");
        System.out.println(mercedes.color);
    }
}
