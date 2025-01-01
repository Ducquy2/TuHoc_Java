package BaiTap_Java;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        Viết chương trình cho phép nhập vào 3 số
//Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh h : ");
        double a = sc.nextDouble();
        System.out.println("Nhap canh goc vuong : ");
        double b = sc.nextDouble();
        System.out.println("Nhap co so: ");
        double c = sc.nextDouble();
        if (a*a == b*b + c*c ){
            System.out.println("day la tam giac vuong");
        } else {
            System.out.println("Day ko phai tam giac vuong");
        }
    }
}
