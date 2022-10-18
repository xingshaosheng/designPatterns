package creator.single.pattern;

/*
名称：单例模式
类型：创建型
说明：
    保证一个类只有一个实例，并提供全局访问点
使用场景：
    一个类只想要一个实例的时候
优点：
    1.在内存中只有一个实例，减少创建销毁的开销
    2.避免对资源的重复占用
缺点：
    无法继承，与单一职责原则冲突
实现方式：
    1.懒汉式
    2.饿汉式
*/

public class SingleModule {
    public static void main(String[] args){
        //懒汉式单例模式
        LazySingle.getInstance().doSomething();
        //饿汉式单例模式
        HungrySingle.getInstance().doSomething();
    }
}
