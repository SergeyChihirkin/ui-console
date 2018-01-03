package console.state;

public class SimpleState extends AbstractState {
    @Override
    protected void printDefaultInformation() {
        System.out.println("Simple state has been launched.");
    }

    @Override
    protected int printMainActions() {
        return 0;
    }

    @Override
    protected void runAction(int action) {

    }
}
