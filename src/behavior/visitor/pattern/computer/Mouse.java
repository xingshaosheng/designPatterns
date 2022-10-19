package behavior.visitor.pattern.computer;

import behavior.visitor.pattern.ComputerPartVisitor;

public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
