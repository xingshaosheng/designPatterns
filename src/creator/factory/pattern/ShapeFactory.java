package creator.factory.pattern;

import creator.factory.pattern.product.Circle;
import creator.factory.pattern.product.Rectangle;
import creator.factory.pattern.product.Shape;
import creator.factory.pattern.product.Square;

public class ShapeFactory {
    //产品实例化方法可改为静态方法
    public Shape getShape(String name){
        if ("Circle".equalsIgnoreCase(name)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(name)) {
            return new Square();
        } else if ("Rectangle".equalsIgnoreCase(name)) {
            return new Rectangle();
        }
        return null;
    }
}
