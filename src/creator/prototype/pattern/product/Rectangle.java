package creator.prototype.pattern.product;

public class Rectangle extends Shape{
    public Rectangle(){type = "Rectangle";}

    @Override
    public void Draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
