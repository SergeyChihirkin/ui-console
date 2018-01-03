package console;

import console.state.MainState;

public class ConsoleUI {

    public static void main(String[] args) {
        MainState state = new MainState();

        state.run();

        System.out.println("Exiting.. Thank you.");
    }
}
