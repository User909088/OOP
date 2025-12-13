package nested_class.sncasm;

public class Math_Util {

    // Static Nested Class (good for grouping related functionality)
    static class Calculator {
        private int a;
        private int b;

        public Calculator(int a, int b){
            this.a = a;
            this.b = b;
        }

        public void add(){
            System.out.println(a + b);
        }
    }

    public static void main(String[] args) {
        Calculator ad = new Calculator(12, 13);
        ad.add();
    }
}
