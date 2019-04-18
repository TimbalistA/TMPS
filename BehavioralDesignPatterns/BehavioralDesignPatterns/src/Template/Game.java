package Template;

public abstract class Game {
    abstract void startGame();
    abstract void play();
    abstract void endGame();
    void run(){
        startGame();
        play();
        endGame();
    }
}
