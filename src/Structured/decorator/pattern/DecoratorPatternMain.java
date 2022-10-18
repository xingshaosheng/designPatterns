package Structured.decorator.pattern;

import Structured.decorator.pattern.decorator.RedShapeDecorator;
import Structured.decorator.pattern.decorator.ShapeDecorator;
import Structured.decorator.pattern.shape.Circle;
import Structured.decorator.pattern.shape.Rectangle;
import Structured.decorator.pattern.shape.Shape;


/*
名称：装饰器模式
类型：结构型
说明：
    用于给一个对象添加一些额外的功能
使用场景：
    1.扩展一个类的功能
    2.动态增加类的功能，动态撤销
优点：
    1.可以动态的扩展一个实现类的功能，是继承的替代模式
    2.装饰类和被装饰类可以独立发展，不相互耦合
缺点：
    1.多层装饰比较复杂，增加代码理解难度
实现方式：
    1.Component 类充当抽象角色，不应该具体实现
    2.装饰抽象类依赖和继承Component类，具体扩展类重写父类方法
*/
public class DecoratorPatternMain {
    public static void main(String args[]){
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
