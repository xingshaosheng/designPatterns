package behavior.command.pattern;
import behavior.command.pattern.order.BuyStock;
import behavior.command.pattern.order.SellStock;
/*
名称：命令模式
类型：行为型
说明：
    命令模式是一种数据驱动的设计模式，将一个请求封装成一个对象，从而可以用不同的请求对客户进行参数化。
    打破软件系统中，行为请求者和行为实现者的一种紧耦合关系
使用场景：
    认为是命令的地方都可以使用命令模式
优点：
    1.降低系统的耦合度
    2.新的命令可以很容易添加到系统中去
缺点：
    1.导致某些系统过多的具体命令类
实现方式：
    1.定义请求类
    2.定义命令执行接口和实体类，实体类中依赖请求类执行请求方法
    3.定义命令调用者类，负责添加命令和执行命令
*/
public class CommandPatternMain {
    public static void main(String[] args){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
