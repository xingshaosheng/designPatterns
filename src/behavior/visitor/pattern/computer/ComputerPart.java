package behavior.visitor.pattern.computer;

import behavior.visitor.pattern.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
