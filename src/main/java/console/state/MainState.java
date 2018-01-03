package console.state;

public class MainState extends AbstractState {
    @Override
    protected void runAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Hello world!");
                break;
            case 2:
                break;
        }
    }

    @Override
    protected int printMainActions() {
        System.out.println(" 1) Print \"Hello world!\"");
        System.out.println(" 2) Do nothing");
        return 2;
    }

    @Override
    protected void printDefaultInformation() {}
}
