package BaiTap_Java;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
//        Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra số Fibonacci ứng với nó.
//          Số Fibonacci là số mà nó bằng tổng của 2 số Fibonacci trước nó.
//          Với giả thuyết là Fi(0) = 1, Fi(1) = 1.
//          Ta có ví dụ: Fi(2) = Fi(0) + Fi(1) = 1+1 = 2,
//          Fi(3) =Fi(2) + Fi(1) = 2+1 = 3,
//          Fi(4) = Fi(3) + Fi(2) = 3+2 = 5,...
//          Giả sử n = 4, đầu ra sẽ là 5.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
//        Kiem tra dieu kien n <= 20
        if (n >= 0 && n <= 20){
            int fi = fibonacci(n);
            System.out.println("Số Fibonacci ứng với n = " + n + " là: " + fi);
        }
        else { System.out.println("Vui lòng nhập một số nguyên trong khoảng từ 0 đến 20.");
        }


    }

//    Ham tinh Fi
    public static int fibonacci(int n){
//        Hàm fibonacci tính số Fibonacci bằng cách gọi đệ quy.
//        Nếu n là 0 hoặc 1, trả về 1.
//        Nếu n lớn hơn 1, trả về tổng của fibonacci(n - 1) và fibonacci(n - 2).
        if (n==0 || n ==1){
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
