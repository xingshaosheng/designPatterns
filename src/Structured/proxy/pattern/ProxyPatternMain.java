package Structured.proxy.pattern;
/*
名称：代理模式
类型：结构型
说明：
    代理模式用于想要在访问一个类时做一些控制或者直接访问对象会带来一些问题（比如对象在远程机器上）时
使用场景：
    1.各种代理（远程代理、虚拟代理...）
优点：
    1.职责清晰
    2.高扩展性
    3.智能化
缺点：
    1.增加了代理，造成响业速度变慢
    2.实现代理模式需要额外的工作，有些代理模式的实现非常复杂
实现方式：
    1.增加中间层
    2.实现与代理类组合，在代理类中调用实现功能
*/
public class ProxyPatternMain {
    public static void main(String args[]){
        Image image = new ProxyImage("test_image.ipg");

        image.display();
        image.display();
    }
}
