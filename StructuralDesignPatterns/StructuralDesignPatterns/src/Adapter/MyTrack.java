package Adapter;

public class MyTrack implements Track{
    @Override
    public void clean(){
        System.out.println("Track is clean");
    }
}
