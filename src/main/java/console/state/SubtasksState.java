package console.state;

public class SubtasksState extends AbstractState {
    @Override
    protected void printDefaultInformation() {
        System.out.println("Subtasks state has been launched");
    }

    @Override
    protected int printMainActions() {
        System.out.println(" 1) Launch first subtask");
        System.out.println(" 2) Launch second subtask");
        return 2;
    }

    @Override
    protected void runAction(int action) {
        switch (action) {
            case 1:
                printFirstSubtask();
                break;
            case 2:
                printSecondSubtask();
                break;
        }
    }

    private void printFirstSubtask() {
        System.out.println("The first subtask has been launched.");
    }

    private void printSecondSubtask() {
        System.out.println("The second subtask has been launched.");
    }
}
