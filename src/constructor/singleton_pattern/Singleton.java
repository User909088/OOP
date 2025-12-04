package constructor.singleton_pattern;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("who are you");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args) {
     Singleton obb =  Singleton.getInstance();
     Singleton odd =  Singleton.getInstance();

        System.out.println(obb == odd);
    }
}
