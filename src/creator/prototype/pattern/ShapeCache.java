package creator.prototype.pattern;

import creator.prototype.pattern.product.Circle;
import creator.prototype.pattern.product.Rectangle;
import creator.prototype.pattern.product.Shape;
import creator.prototype.pattern.product.Square;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String type){
        Shape cacheShape = shapeMap.get(type);
        return (Shape) cacheShape.clone();
    }

    //可以在构造函数中执行
    public static void loadCache(){
        Shape circle = new Circle();
        shapeMap.put(circle.getType(),circle);

        Shape rectangle = new Rectangle();
        shapeMap.put(rectangle.getType(),rectangle);

        Shape square = new Square();
        shapeMap.put(square.getType(),square);
    }
}
