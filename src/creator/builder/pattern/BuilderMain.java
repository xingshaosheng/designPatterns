package creator.builder.pattern;
/*
名称：建造者模式
类型：创建型
说明：
    用于复杂对象的构建，使构建和表示相分离，同样的构建过程可以创建不同的表示。
使用场景：
    1.需要生成的对象比较复杂
    2.需要生成的对象内部属性相互依赖
优点：
    1.建造者独立，易扩展
缺点：
    1.产品必须具有共同点，范围有限制
    2.内部变化复杂，会有很多的建造类
实现方式：
    1.构建复杂对象的内部子对象(建造者)
    2.通过复杂对象实例化子对象的整合(导演)
    3.通过复杂对象构建对象构建复杂对象
*/
public class BuilderMain {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        mealBuilder.prepareVegMeal().showItems();
        System.out.printf("套餐价格为:%s",mealBuilder.prepareVegMeal().getCost());
        System.out.println();

        mealBuilder.prepareNonVegMeal().showItems();
        System.out.printf("套餐价格为:%s",mealBuilder.prepareNonVegMeal().getCost());
    }
}
