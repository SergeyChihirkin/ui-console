package console.state;

public class SubtasksState extends AbstractState {
    @Override
    protected void printDefaultInformation() {
        System.out.println("Subtasks state has been launched");
    }

    @Override
    protected int printMainActions() {
        System.out.println(" 1) Launch first subtask");
        System.out.println(" 2) Print double value");
        return 2;
    }

    @Override
    protected void runAction(int action) {
        switch (action) {
            case 1:
                printFirstSubtask();
                break;
            case 2:
                readDoubleValue();
                break;
        }
    }

    private void printFirstSubtask() {
        System.out.println("The first subtask has been launched.");
    }

    private void readDoubleValue() {
        double doubleValue = readDoubleInput("Print double value: ");

        System.out.println(String.format("You have printed: %f", doubleValue));
    }

}
