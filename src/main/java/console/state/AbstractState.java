package console.state;

import java.util.Scanner;
import java.util.function.Function;

public abstract class AbstractState {
    private static Scanner scanner = new Scanner(System.in);
    
    public void run() {
        printDefaultInformation();
        int action = 0;
        do {
            printDelimiter();
            System.out.println("What would you like to do?");
            int maxInput = printMainActions();
            System.out.println(" 0) Return");
            action = readUserActionInput(maxInput);
            System.out.println("");
            if (action > 0)
                runAction(action);
        } while (action > 0);
    }

    protected void printDelimiter() {
        System.out.println("--------------------------------------------");
    }

    protected String readStringInput(String prefix) {
        System.out.print(prefix);
        String line = scanner.nextLine();
        return line;
    }
    
    protected <R> R readInput(String prefix, Function<String, R> convertFunction) {
        R input = null;
        do {
            String str = readStringInput(prefix);
            try {
                input = convertFunction.apply(str);
            } catch (Exception e) {
                System.err.println("Failed to convert: " + e.getMessage());
                input = null;
            }
        } while (input == null);
        return input;
    }

    protected int readIntInput(String prefix) {
        return readInput(prefix, Integer::parseInt);
    }

    protected double readDoubleInput(String prefix) {
        return readInput(prefix, Double::parseDouble);
    }

    protected abstract void printDefaultInformation();

    protected abstract int printMainActions();

    protected abstract void runAction(int action);
    
    private int readUserActionInput(int maxInput) {
        do {
            int action = readIntInput("Please, input desired action: ");
            if (action >= 0 && action <= maxInput) {
                return action;
            }
        } while (true);
    }
}