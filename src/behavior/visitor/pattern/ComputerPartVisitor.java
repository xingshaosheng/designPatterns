package behavior.visitor.pattern;

import behavior.visitor.pattern.computer.Computer;
import behavior.visitor.pattern.computer.Keyboard;
import behavior.visitor.pattern.computer.Monitor;
import behavior.visitor.pattern.computer.Mouse;

public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Computer computer);
}
