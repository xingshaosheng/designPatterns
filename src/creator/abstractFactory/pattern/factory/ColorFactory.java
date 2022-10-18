package creator.abstractFactory.pattern.factory;

import creator.abstractFactory.pattern.color.Blue;
import creator.abstractFactory.pattern.color.Color;
import creator.abstractFactory.pattern.color.Green;
import creator.abstractFactory.pattern.color.Red;
import creator.abstractFactory.pattern.shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        if(name.equalsIgnoreCase("red")) return new Red();
        else if (name.equalsIgnoreCase("green")) return new Green();
        else if (name.equalsIgnoreCase("blue")) return new Blue();
        return null;
    }
}
