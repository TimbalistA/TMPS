package Visitor;

public class Cat implements Animal {
    @Override
    public void doNoise(Visitor visitor){
        visitor.doCat();
    }
}