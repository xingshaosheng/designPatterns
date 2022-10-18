package creator.abstractFactory.pattern.factory;

import creator.abstractFactory.pattern.color.Color;
import creator.abstractFactory.pattern.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String name);
    public abstract Color getColor(String name);
}
