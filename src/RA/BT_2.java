package RA;

import javax.management.loading.MLet;
import java.util.Scanner;

public class BT_2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Giá quy đổi hiện tại 1USD=25.446,50 VND");
       System.out.println("Nhập số tiền bạn muốn đổi:");
       Float usdIn = sc.nextFloat();
       Double vnd = 25446.50;
       Double moneyValue =  usdIn*vnd;
       System.out.println("đây là số tiền bạn đổi được: "+moneyValue+"VND");





   }
}
