package Structured.filter.pattern;

import Structured.filter.pattern.criteria.CriteriaMale;
import Structured.filter.pattern.criteria.CriteriaSingle;

import java.util.ArrayList;
import java.util.List;

/*
名称：过滤器模式
类型：结构型
说明：
    实现根据不同的标准来过滤一组对象
使用场景：
    对象过滤
优点：
    1.自定义过滤标准
    2.易扩展
缺点：
    1.每增加一个过滤标准需要新增一个过滤器类
实现方式：
    1.定义过滤器接口
    2.根据过滤标准实现过滤器
*/
public class FilterPatternMain {
    public static void main(String args[]){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        //使用示例
        printPersons(new CriteriaSingle().meetCriteria(new CriteriaMale().meetCriteria(persons)));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
