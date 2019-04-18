package Visitor;

public class Dog implements Animal {
    @Override
    public void doNoise(Visitor visitor){
        visitor.doDog();
    }
}
