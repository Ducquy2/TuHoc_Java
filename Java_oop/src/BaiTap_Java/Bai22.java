 package BaiTap_Java;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
//        Viet truong trinh tinh tong so chan va so le
//        Tinh tong se le
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
            sumEven += i;
            } else {
            sumOdd += i;
            }
        }
        System.out.println("Tong so chan: " + sumEven);
        System.out.println("Tong so le: " + sumOdd);

        
    }
}
