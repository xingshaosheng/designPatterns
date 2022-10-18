package creator.prototype.pattern;

import creator.prototype.pattern.product.Shape;

/*
名称：原型模式
类型：创建型
说明：
    利用已有的一个原型对象，快速地生成和原型对象一样的实例，通过clone创建新的对象，而不是通过new创建新的对象。
使用场景：
    项目优化，提高性能
优点：
    1.性能提高
    2.逃避构造函数得约束，新建实例时不需要考虑构造函数
缺点：
    当原型对象涉及到引用不支持串行化的间接对象时比较麻烦
实现方式：
    1.抽象基类实现Cloneable接口
    2.原型对象继承抽象基类
    3.new 出原型对象缓存到对象获取类中
    4.在对象获取类中根据原型对象clone 出新的对象并返回
*/
public class PrototypeMain {
    public static void main(String args[]){
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("Circle");
        circle.Draw();
    }
}
