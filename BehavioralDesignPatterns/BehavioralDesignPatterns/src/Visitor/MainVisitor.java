package Visitor;

public class MainVisitor {
    public static void main(String[]args){
        Animal animal = new Dog();
        animal.doNoise(new ConcreteVisitor());
    }
}
