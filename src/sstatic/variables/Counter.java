package sstatic.variables;

public class Counter {
    static int count = 0;

    public Counter(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        new  Counter();
        new Counter();

        System.out.println("Count: " + Counter.getCount());
        System.out.println("Count: " + Counter.getCount());
    }
}
