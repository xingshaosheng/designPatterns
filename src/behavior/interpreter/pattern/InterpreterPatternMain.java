package behavior.interpreter.pattern;

import behavior.interpreter.pattern.expression.AndExpression;
import behavior.interpreter.pattern.expression.Expression;
import behavior.interpreter.pattern.expression.OrExpression;
import behavior.interpreter.pattern.expression.TerminalExpression;

/*
名称：解释器模式
类型：行为型
说明：
    解释器模式提供了评估语言的语法或表达式的方式，这种模式实现一个表达式接口，该接口解释一个特定的上下文(context)
使用场景：
    1.一个简单语法需要解释的场景
    2.一些重复出现的问题可以用一种简单的语言来进行表达
    3.可以将一个需要解释执行的语言中的句子表示为一个抽象语法树
优点：
    1.可扩展性比较好、灵活
    2.增加了新的解释表达式的方式
    3.易于实现简单文法
缺点：
    1.可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替
    2.对于复杂的文法比较难维护
    3.解释器模式会引起类膨胀
    4.解释器模式采用递归调用方法
实现方式：
    1.定义解释器
    2.构建环境类(context)，包含解释器之外的一些全局信息，一般是 HashMap
*/
public class InterpreterPatternMain {
    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String args[]){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
