package console.state;

import java.time.LocalDateTime;

public class SubtasksState extends AbstractState {
    @Override
    protected void printDefaultInformation() {
        System.out.println("Subtasks state has been launched");
    }

    @Override
    protected int printMainActions() {
        System.out.println(" 1) Print date value");
        System.out.println(" 2) Print double value");
        return 2;
    }

    @Override
    protected void runAction(int action) {
        switch (action) {
            case 1:
                printDateValue();
                break;
            case 2:
                readDoubleValue();
                break;
        }
    }

    private void printDateValue() {
        LocalDateTime localDateTime = readDateTimeInput(String.format("Print datetime value: (%s): ",
                DATE_TIME_INPUT_PATTERN));

        System.out.println(String.format("You have printed: %s", formatDateTime(localDateTime)));
    }

    private void readDoubleValue() {
        double doubleValue = readDoubleInput("Print double value: ");

        System.out.println(String.format("You have printed: %f", doubleValue));
    }

}
