package creator.single.pattern;

public class LazySingle {
    private static LazySingle lazySingle;
    private LazySingle(){}

    public static LazySingle getInstance(){
        if(lazySingle == null) lazySingle = new LazySingle();
        return lazySingle;
    }

    public static synchronized LazySingle getSecureInstance(){
        if(lazySingle == null) lazySingle = new LazySingle();
        return lazySingle;
    }

    public void doSomething(){System.out.println("Lazy single do something!");}
}
