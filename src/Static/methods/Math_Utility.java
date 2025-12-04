package Static.methods;

import java.util.Scanner;

public class Math_Utility {
    public static int ab(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Sum of those: " + Math_Utility.ab(x, y));
    }
}
