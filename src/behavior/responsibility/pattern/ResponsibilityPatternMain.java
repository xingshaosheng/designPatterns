package behavior.responsibility.pattern;

import behavior.responsibility.pattern.log.AbstractLogger;
import behavior.responsibility.pattern.log.ConsoleLogger;
import behavior.responsibility.pattern.log.ErrorLogger;
import behavior.responsibility.pattern.log.FileLogger;

/*
名称：责任链模式
类型：行为型
说明:
    责任链模式用于解耦发送者和处理者，客户只需要将请求发送到责任链上即可，无须关心请求的处理细节和请求的传递
使用场景：
    1.多个对象可以处理同一请求，具体由哪个对象处理由运行时刻决定
    2.动态指定一组对象处理请求
优点：
    1.降低耦合度
    2.简化了调用，调用者不需要知道链的结构
    3.增加了给对象指派处理器的灵活性，通过改变链内部的成员或者调动它们的次序，允许动态新增或删除处理器
    4.增加新的处理器很方便
缺点：
    1.不能保证请求一定会被处理
    2.不容易观察运行的特征，添加代码调试难度
实现方式：
    1.在处理器中聚合自己
    2.构建责任链
    3.在处理方法中判断是否合适，如果没达到处理条件则沿着责任链向下传递
*/
public class ResponsibilityPatternMain {
    public static void main(String args[]){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
    //创建责任链
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        //返回责任链链头
        return errorLogger;
    }
}