package behavior.visitor.pattern;

import behavior.visitor.pattern.computer.Computer;
import behavior.visitor.pattern.computer.ComputerPart;

/*
名称：访问者模式
类型：行为型
说明：
    通过访问者模式可以实现数据结构与数据操作分离，对数据类的操作可以随着访问者改变而改变，多用于解决
    稳定的数据结构与易变的操作耦合问题
使用场景：
    1.对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作
    2.需要对一个对象结构中的对象进行很多不同的并且不相关的操作
优点：
    1.符合单一职责原则
    2.优秀的扩展性
缺点：
    1.具体元素对访问者公布细节，违反迪米特原则
    2.具体元素变更比较困难
    3.违反了依赖倒置原则，依赖了具体类，没有依赖抽象类
实现方式：
    1.定义数据基础类接口和数据基础类
    2.定义访问者接口
    3.在数据基础类里面有一个方法接受访问者，将自身引用传入访问者
    4.在访问者类中执行针对基础数据类的操作
*/
public class VisitorPatternMain {
    public static void main(String args[]){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
