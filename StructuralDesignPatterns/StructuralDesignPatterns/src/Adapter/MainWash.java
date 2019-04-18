package Adapter;

public class MainWash {
    public static void main(String[] args){
        CarWash carWash = new CarWash();
        carWash.washCar(new Audi());
        carWash.washCar(new TrackWrap(new MyTrack()));
    }
}


