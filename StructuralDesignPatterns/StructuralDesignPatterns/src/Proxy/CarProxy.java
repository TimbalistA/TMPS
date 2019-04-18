package Proxy;

import Adapter.CarWash;

public class CarProxy implements CarInterface {
    CarInterface car = new Reno();

    @Override
    public void drive(){
        System.out.println("Proxy Code");
        car.drive();
    }
}
