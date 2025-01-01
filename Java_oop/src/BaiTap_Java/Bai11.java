package BaiTap_Java;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
//      Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//      Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
        Scanner sc = new Scanner(System.in);
        float kq = 0;
        int[] soNguyen;
        System.out.println("Nhập vào n:");
        int n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("Nhap vao so nguyen thu "+i+" : ");
            soNguyen[i] = sc.nextInt();
        }
        for (int i =0 ;i<n;i++){
            kq+=soNguyen[i];
            kq=kq/n;
        }
        System.out.println("Tbc : "+kq);
    }
}
