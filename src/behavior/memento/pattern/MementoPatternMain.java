package behavior.memento.pattern;
/*
名称：备忘录模式
类型：行为型
说明：
    备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以供后期可以恢复到该状态
使用场景：
    1.需要保存/恢复数据的相关场景
    2.提供一个可回滚的操作
优点：
    1.给用户提供一种可以恢复状态的机制，可以回到某个历史的状态
    2.实现信息的封装，用户不需要关心状态的保存细节
缺点：
    消耗内存，保存状态即新增状态类。可以使用原型模式+备忘录模式节约内存
实现方式：
    1.定义备忘录类
    2.定义备忘录管理类
    3.需要保存状态时，获取备忘录类实例，并保存到备忘录管理类中
    4.需要恢复状态时，从备忘录管理器中获取备忘录实例，并恢复状态
*/
public class MementoPatternMain {
    public static void main(String args[]){
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
