package BaiTap_Java;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//    Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta
//    nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//    Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0,
//    ngược lại in ra “Đây là số nguyên âm”.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen : ");
        int n = sc.nextInt();
        if (n>=0){
            System.out.println("Day la so nguyen duong!");
        }else {
            System.out.println("Day ko phai la so nguyen duong!");
        }
    }
}
