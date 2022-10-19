package behavior.mediator.pattern;
/*
名称：中介者模式
类型：行为型
说明：
    当对象与对象之间存在大量的关系，将会导致系统的结构变得很复杂，用一个中介对象来封装一系列的对象交互，中介者使个对象不需要显式地相互引用，从而
    使其耦合松散，并且可以独立地改变它们之间的交互
使用场景：
    1.系统中对象之间存在比较复炸得引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象
    2.通过一个中间类来封装多个类的行为
优点：
    1.降低了类的复杂度，将一对多的关系转化为一对一的关系
    2.各个类之间解耦
    3.符合迪米特原则
缺点：
    中介者越来越复杂，变得难以维护
实现方式：
    将对象之间的通信封装到中介者类中单独出来
*/
public class MediatorPatternMain {
    public static void main(String args[]){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
