package creator.abstractFactory.pattern;

import creator.abstractFactory.pattern.factory.AbstractFactory;
import creator.abstractFactory.pattern.factory.FactoryProducer;

/*
名称：抽象工厂模式
类型：创建型
说明：
    工厂模式外再套一层抽象工厂，
使用场景：
    系统的产品有多于一个的产品族，而系统只消费其中某一族的产品，一个产品组相当于一个工厂模式。
优点：
    当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象
缺点：
    产品族扩展比较麻烦
实现方式：
    1.实现工厂模式
    2.工厂类继承抽象类
    3.通过抽象工厂获取工厂抽象类，根据工厂抽象类获取"产品"实例
*/
public class AbstractFactoryMain {
    public static void main(String args[]){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shapeFactory");
        shapeFactory.getShape("circle").draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("colorFactory");
        colorFactory.getColor("red").fill();
    }
}
