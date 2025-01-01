package BaiTap_Java;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
//        Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//In ra tất cả số nguyên tố trong khoảng từ 0 - n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        while (n>1000){
            System.out.println("Nhap lai n(n<1000) : ");
            n = sc.nextInt();
        }
        for (int i =0;i<=n;i++){
            if (checkSonto(i)){
                System.out.println(i + " Day la so nto");
            }else {
                System.out.println(i + " Day ko phai so nto");
            }
        }
    }

    // ham ktra so nguyen to
    public static boolean checkSonto(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2;i <= n/2;i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
