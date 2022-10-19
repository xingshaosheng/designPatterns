package behavior.state.pattern.state;

import behavior.state.pattern.Context;

public interface State {
    public void doAction(Context context);
}
