package behavior.observer.pattern;

import behavior.observer.pattern.observer.BinaryObserver;
import behavior.observer.pattern.observer.HexObserver;
import behavior.observer.pattern.observer.Observer;
import behavior.observer.pattern.observer.OctalObserver;

/*
名称：观察者模式
类型：行为型
说明：
    当对象间存在一对多关系时，观察者模式可以实现目标对象的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知
使用场景：
    1.一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度
    2.个对象必须通知其他对象，而并不知道这些对象是谁
    3.需要在系统中创建一个触发链
优点：
    1.观察者和被观察者是抽象耦合的
    2.在一对多的关系中建立一套触发机制
缺点：
    1.观察者数量过多，则通知时间会有延迟，可以用异步处理
    2.若观察者和被观察者相互调用，则会陷入死循环
实现方式：
    1.定义观察者抽象类
    2.定义观察者对象
    3.在被观察者对象中添加ArrayList存放观察者
    4.被观察者状态改变，则通过遍历方式通知观察者
*/
public class ObserverPatternMain {
    public static void main(String args[]){
        Subject subject = new Subject();

        Observer binaryObject = new BinaryObserver(subject);
        Observer octalObject = new OctalObserver(subject);
        Observer hexObject = new HexObserver(subject);

        subject.setState(15);
    }
}
