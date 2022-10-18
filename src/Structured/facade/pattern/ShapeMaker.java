package Structured.facade.pattern;

import Structured.facade.pattern.shape.Circle;
import Structured.facade.pattern.shape.Rectangle;
import Structured.facade.pattern.shape.Shape;
import Structured.facade.pattern.shape.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
