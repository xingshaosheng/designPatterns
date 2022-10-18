package creator.prototype.pattern.product;

public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    public void Draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
