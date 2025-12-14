package sstatic.block;

public class Initializer {
    static int value = 1000;

    static {
        System.out.println(value);
    }

    public static void main(String[] args) {
        System.out.println("Value:" + Initializer.value);
    }
}
