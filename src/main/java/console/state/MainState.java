package console.state;

import java.util.HashMap;
import java.util.Map;

public class MainState extends AbstractState {

    private Map<Integer, AbstractState> childStates = new HashMap<>();

    public MainState() {
        childStates.put(1, new CompositeState());
        childStates.put(2, new SimpleState());
    }

    @Override
    protected void runAction(int action) {
        AbstractState state = childStates.get(action);
        if (state != null) {
            state.run();
        } else {
            System.err.println("No state configured for selected action :(");
        }
    }

    @Override
    protected int printMainActions() {
        System.out.println(" 1) Composite state");
        System.out.println(" 2) Simple state");
        return 2;
    }

    @Override
    protected void printDefaultInformation() {}
}
