package behavior.observer.pattern.observer;

import behavior.observer.pattern.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
