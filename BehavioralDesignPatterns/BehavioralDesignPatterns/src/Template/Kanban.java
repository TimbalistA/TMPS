package Template;

public class Kanban extends Game {
    @Override
    void startGame(){
        System.out.println("First step");
    }
    @Override
    void play(){
        System.out.println("Second step");
    }
    @Override
    void endGame(){
        System.out.println("Third step");
    }
}
