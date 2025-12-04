package Static.block_complex_init;

public class Complex_Initializer {
    private static int x;
    private static int y;
    private static int z;

    static {
        x = 0;
        y = 2;
        z = calculate(x, y);
    }

    public static int calculate(int x, int y){
        return x + y * x + x * y + y * y + 1;
    }

    public static void main(String[] args) {
        System.out.println("Complex: " + z);
    }
}
