package behavior.strategy.pattern;

import behavior.strategy.pattern.strategy.OperationAdd;
import behavior.strategy.pattern.strategy.OperationMultiply;
import behavior.strategy.pattern.strategy.OperationSubtract;

/*
名称：策略模式
类型：行为型
说明：
    策略模式使得一个类的行为或算法可以在运行过程中被更改。用于解决在有多种算法相似的情况
    下，使用 if...else 所带来的复杂和难以维护
使用场景：
    1.一个系统需要动态地在几种算法中选择一种
    2.在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地
    让一个对象在许多行为中选择一种行为
优点：
    1.算法可以自由切换
    2.避免使用多重条件判断
    3.扩展性良好
缺点：
    1.策略类会增多
    2.所有策略类都需要对外暴露
实现方式：
    1.定义策略接口并实现策略类
    2.对象依赖策略类，通过传入的策略对象执行对应的操作
*/
public class StrategyPatternMain {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
