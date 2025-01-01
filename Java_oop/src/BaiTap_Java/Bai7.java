package BaiTap_Java;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
//        Viết chương trình để nhập nhập một số nguyên,
//        tìm kết quả phép nhân của số đó với các số từ 1 - 20 ,
//        sau đó in kết quả ra màn hình.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        for (int i=1;i<=20;i++){
            int result = n*i;
            System.out.println(n+" * "+i+" = "+result);
        }
    }
}
