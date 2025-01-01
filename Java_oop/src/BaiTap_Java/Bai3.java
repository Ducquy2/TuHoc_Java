package BaiTap_Java;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so 1 : ");
        double a = sc.nextDouble();
        System.out.println("Nhap so 2 : ");
        double b = sc.nextDouble();
        System.out.println("Nhap so 3 : ");
        double c = sc.nextDouble();
        if ((a+b)>c & (a+c)>b & (b+c)>a){
            System.out.println("Day la 3 canh cua tam giac");
        }else {
            System.out.println("Day ko phai la 3 canh cua tam giac");
        }
    }
}
