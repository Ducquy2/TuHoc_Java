package BaiTap_Java;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
//        Dãy số Fibonacci được định nghĩa như sau:
//        F0 =1,  F1  = 1; Fn  =  Fn-1  +  Fn-2 với  n>=2.
//        Hãy viết chương trình tìm số Fibonacci thứ n
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        int fi = tinhFi(n);
        System.out.println("Số Fibonacci ứng với n = " + n + " là: " + fi);


    }

//    Ham tinh fibonacci
    public static int tinhFi(int num){
        if (num==0 || num == 1){
            return 1;
        }else {
            return tinhFi(num-1)+tinhFi(num-2);
        }
    }
}
