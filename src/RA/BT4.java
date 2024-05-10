package RA;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điêm môn Toán: ");
        double markPoint = sc.nextDouble();
        System.out.println("Nhập điêm môn Văn: ");
        double liraPoint = sc.nextDouble();
        System.out.println("Nhập điêm môn Tiếng Anh: ");
        double enPoint = sc.nextDouble();
        double subjectAve = (markPoint + liraPoint + enPoint)/3;
        System.out.println("Đây là điểm trung bình 3 môn: "+subjectAve);
    }
}
