package behavior.state.pattern;

import behavior.state.pattern.state.StartState;
import behavior.state.pattern.state.State;
import behavior.state.pattern.state.StopState;

/*
名称：状态模式
类型：行为型
说明：
    对象的行为依赖于它的状态，并且可以根据它的状态改变而改变它的相关行为
使用场景：
    1.随着状态改变而改变的场景
    2.条件、分支语句的代替者
优点：
    1.将对象实现与对象分离，对象可以根据不同的状态执行不同的实现，易扩展
    2.相比于条件、分支语句，更易于扩展对象状态
缺点：
    1.增加系统类的数量
    2.结构和实现都较为复杂，使用不当容易导致结构和代码婚礼
    3.增加新的状态需要改状态转换部分代码，不符合开闭原则
实现方式：
    1.定义状态接口
    2.实例化状态接口，依赖操作对象，对不同的状态实现不同的操作
*/
public class StatePatternMain {
    public static void main(String args[]){
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);

        State stopState = new StopState();
        stopState.doAction(context);
    }
}
