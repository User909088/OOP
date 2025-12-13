package sstatic.final_variables;

import java.util.Scanner;

public class Constants {
    static final double PI = 3.14159;

    static double getPi(){
        return PI;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextInt();
        System.out.println("Radius:" + r);
        System.out.println("Area: " + Constants.getPi() * Math.pow(r, 2) );
        }
}
