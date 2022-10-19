package behavior.visitor.pattern.computer;

import behavior.visitor.pattern.ComputerPartVisitor;

public class Computer implements ComputerPart{

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart computerPart : parts) computerPart.accept(computerPartVisitor);

        computerPartVisitor.visit(this);
    }
}
