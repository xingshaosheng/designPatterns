package behavior.iterator.pattern;
/*
名称：迭代器模式
类型：行为型
说明：
    迭代器模式将元素之间游走的责任交给迭代器，实现一个聚合对象的遍历。将存储数据和遍历数据的职责分离，方便使用不同的方式来遍历整个对象
使用场景：
    1.访问一个聚合对象的内容而无须暴露它的内部表示
    2.为聚合对象提供多种遍历方式
    3.为遍历不同的聚合机构提供一个统一的接口
优点：
    1.支持以不同的方式遍历聚合对象
    2.简化了聚合类的遍历
    3.方便添加新的迭代器和新的聚合类
缺点：
    由于迭代器模式将存储数据和遍历数据的职责分离，增加系统类的数量和系统复杂度
实现方式：
    1.定义迭代器接口：hasNext,next
    2.实现迭代器
    3.在数据存储实例中返回迭代器实例
    4.通过返回的迭代器实例实现数据遍历
*/
public class IteratorPatternMain {
    public static void main(String arg[]){
        NameRepository nameRepository = new NameRepository();

        for (Iterator item = nameRepository.getIterator();item.hasNext();){
            String name = (String) item.next();
            System.out.println("Name : " + name);
        }
    }
}
