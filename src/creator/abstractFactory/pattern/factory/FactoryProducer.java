package creator.abstractFactory.pattern.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String name){
        if (name.equalsIgnoreCase("ColorFactory")) return new ColorFactory();
        else if(name.equalsIgnoreCase("ShapeFactory")) return new ShapeFactory();
        else return null;
    }
}
