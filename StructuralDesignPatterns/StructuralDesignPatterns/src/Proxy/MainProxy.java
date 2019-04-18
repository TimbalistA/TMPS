package Proxy;

public class MainProxy {
    public static void main(String[] args){
        CarInterface car = new CarProxy();
        car.drive();
    }
}
