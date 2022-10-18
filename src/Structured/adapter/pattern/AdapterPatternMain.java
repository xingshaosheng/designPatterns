package Structured.adapter.pattern;
/*
名称：适配器模式
类型：结构形
说明：
    用于运行系统的接口改动，通过适配器将一个类插入另一个类系中
使用场景：
    在系统运行过程中对接口功能的改动
优点：
    1.可以让两个没有关联的类一起运行，提高类的复用
    2.灵活性好
缺点：
    1.过多的使用适配者模式，会造成项目代码混乱。能重构接口，就不使用适配者
实现方式：
    1.添加新增功能接口和实现接口的实体类
    2.添加适配器，继承或依赖已有对象，并在适配器中实现新功能的调用
    3.在原有接口实现中使用适配器调用新功能
*/
public class AdapterPatternMain {
    public static void main(String args[]){
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3");
        audioPlayer.play("mp4");
        audioPlayer.play("VIc");
    }
}
