package console.state;

public class FirstState extends AbstractState {
    @Override
    protected void printDefaultInformation() {
        System.out.println("First state has been launched.");
    }

    @Override
    protected int printMainActions() {
        System.out.println(" 1) Print \"Hello world!\"");
        return 1;
    }

    @Override
    protected void runAction(int action) {
        switch (action) {
            case 1:
                printHelloWorld();
                break;
        }
    }


    private void printHelloWorld() {
        System.out.println("Hello world!");
    }
}
