package Structured.composite.pattern;
/*
名称：组合模式
类型：结构型
说明：
    用于将对象合成树形结构
使用场景：
    1.树形结构
    2.文件、文件夹的管理
优点：
    1.高层模块调用简单
    2.节点自由增加
缺点：
    1.使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则
实现方式：
    树枝内部组合该接口，并且含有内部属性 List，里面放 Component
*/
public class CompositePattern {
    public static void main(String args[]){
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
