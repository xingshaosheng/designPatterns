package creator.factory.pattern;

import creator.factory.pattern.product.Shape;

/*
名称：工厂模式
类型：创建型
说明：
    通过接口定义同类产品，在不同的条件下创建不同的实例时通过工厂类实例化产品类再返回，工厂类返回的也是一个抽象的产品。
使用场景：
    涉及到多个同类产品对象实例化的使用场景
优点：
    1.易扩展，若增加"产品"，则只需添加产品类和修改工厂类即可
    2.隐藏产品具体实现，调用者只需要关心产品接口
缺点：
    每增加一个产品，都需要增加一个产品类和修改工厂类
实现方式：
    1.通过实现同一接口定义同类型"产品"
    2.通过调用工厂类获取不同的实例"产品"
*/
public class FactoryMain {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        if(circle != null) circle.draw();

        Shape square = shapeFactory.getShape("Square");
        if(square != null) square.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        if(rectangle != null) rectangle.draw();
    }
}
