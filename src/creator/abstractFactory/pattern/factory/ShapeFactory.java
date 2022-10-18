package creator.abstractFactory.pattern.factory;

import creator.abstractFactory.pattern.color.Color;
import creator.abstractFactory.pattern.shape.Circle;
import creator.abstractFactory.pattern.shape.Rectangle;
import creator.abstractFactory.pattern.shape.Shape;
import creator.abstractFactory.pattern.shape.Square;


public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String name) {
        if ("Circle".equalsIgnoreCase(name)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(name)) {
            return new Square();
        } else if ("Rectangle".equalsIgnoreCase(name)) {
            return new Rectangle();
        }
        else return null;
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
