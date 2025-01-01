package BaiTap_Java;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhan n : ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i =0;i<=n;i+=2){
            tong+=i;
            System.out.println(i);
        }
        System.out.println("Tong cac so chan la : "+tong);
    }
}
