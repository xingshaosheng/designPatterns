package creator.single.pattern;

public class HungrySingle {
    private static  HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle(){}

    public static HungrySingle getInstance(){return hungrySingle;}

    public void doSomething(){
        System.out.println("Hungry single do something");
    }
}
