package behavior.template.pattern;

import behavior.template.pattern.game.Football;
import behavior.template.pattern.game.Game;

/*
名称：模板模式
类型：行为型
说明：
    模板模式定义一个操作行为骨架，具体的行为延迟到子类中定义
使用场景：
    1.有多个子类共有的方法，且逻辑相同
    2.重要的、复杂的方法
优点：
    1.封装不变部分，扩展可变部分
    2.提取公共代码，便于维护
    3.行为由父类控制，字类实现
缺点：
    每一个不同的实现都需要一个子类来实现，导致类数量增多
实现方式：
    1.在模板抽象类中定义行为骨架
    2.在子类中定义行为
*/
public class TemplatePatternMain {
    public static void main(String args[]){
        Game game = new Football();
        game.play();
    }
}
