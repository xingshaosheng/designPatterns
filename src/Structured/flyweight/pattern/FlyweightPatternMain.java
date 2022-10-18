package Structured.flyweight.pattern;

import Structured.flyweight.pattern.shape.Circle;

/*
名称：享元模式
类型：结构性
说明：
    当系统需要新建大量的同类对象，并且这些对象的状态大部分可以外部化时，使用享元模式可以减少对象的创建防止内存溢出的问题。
使用场景：
    1.系统有大量的对象
    2.需要缓冲池的场景
优点：
    减少对象的创建，降低系统内存，提高效率
缺点：
    提高系统复杂度
实现方式：
    1.用HashMap存储生成对象
    2.获取对象时判断HashMap中有无该对象，若有则获取对象返回，没有则新建对象
*/
public class FlyweightPatternMain {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args){
        for(int i=0; i < 20; ++i){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
