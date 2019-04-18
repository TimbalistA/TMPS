package State;

public class MainState {
    public static void main(String[]args){
        Context context = new Context(new LowerCaseState(), "Name");
        context.doAction();
        context.setState(new UpperCaseState());
        context.doAction();
    }

}
