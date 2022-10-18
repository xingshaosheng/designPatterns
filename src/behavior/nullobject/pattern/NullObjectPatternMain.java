package behavior.nullobject.pattern;

import behavior.nullobject.pattern.customer.AbstractCustomer;
import behavior.nullobject.pattern.customer.CustomerFactory;

/*
名称：空对象模式
类型：行为型
说明：用一个空对象取代NULL对象实例得检查，空对象模式不是为了检查空值，而是反应一个不做任何动作的关系
*/
public class NullObjectPatternMain {
    public static void main(String args[]){
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
