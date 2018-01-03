package console.state;

public class SecondState extends AbstractState {
    @Override
    protected void printDefaultInformation() {
        System.out.println("Second state has been launched.");
    }

    @Override
    protected int printMainActions() {
        return 0;
    }

    @Override
    protected void runAction(int action) {

    }
}
