package console.state;

public class FirstState extends AbstractState {
    @Override
    protected void printDefaultInformation() {
        System.out.println("First state has been launched.");
    }

    @Override
    protected int printMainActions() {
        System.out.println(" 1) Print \"Hello world!\"");
        System.out.println(" 2) Subtasks");
        return 2;
    }

    @Override
    protected void runAction(int action) {
        switch (action) {
            case 1:
                printHelloWorld();
                break;
            case 2:
                manageSubtasks();
                break;
        }
    }

    private void manageSubtasks() {
        SubtasksState subtasksState = new SubtasksState();
        subtasksState.run();
    }

    private void printHelloWorld() {
        System.out.println("Hello world!");
    }
}