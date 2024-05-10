package RA;

import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();
        double p = 2 * Math.PI * r;
        double A = Math.PI * r * r;
        System.out.println("đây là Chu vi hình tròn: "+p);
        System.out.println("đây là Diện tích hình tròn: "+A);
    }
}
