package Structured.bridge.pattern;

import Structured.bridge.pattern.Draw.GreenCircle;
import Structured.bridge.pattern.Draw.RedCircle;

/*
名称：桥接模式
类型：结构形
说明：
    桥接模式使抽象部分和实现分离，使它们可以独立的变化
使用场景：
    1.系统需要在构建的抽象化角色和具体化角色之间增加更多的灵活性
    2.一个类存在两个独立变化的维度，并且这两个维度都需要扩展
优点：
    1.抽象和实现分离
    2.优秀的扩展能力
    3.实现细节对客户透明
缺点：
    增加系统理解和涉及难度
实现方式：
    1.定义实现接口和实现类
    2.抽象类依赖实现类
    3.抽象类通过依赖的实现类实现具体功能
*/
public class BridgePatternMain {
    public static void main(String args[]){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
