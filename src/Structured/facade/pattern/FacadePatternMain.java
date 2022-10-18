package Structured.facade.pattern;
/*
名称：外观模式
类型：结构形
说明：
    使用外观模式可以降低访问复杂系统内部子系统时的复杂度，简化客户端接口
使用场景：
    1.为复杂的模块或子系统提供外界访问的模块
    2.子系统相对独立
    3.预防菜鸟开发者带来的风险
优点：
    1.减少系统相互依赖
    2.提高灵活性
    3.提高安全性
缺点：
    1.不符合开闭原则
实现方式：
    在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好
*/
public class FacadePatternMain {
    public static void main(String args[]){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
