package BaiTap_Java;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
//        Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
//        Ví dụ: Số  8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
        Scanner sc = new Scanner(System.in);
        // Nhập số nguyên từ bàn phím
        System.out.println("Nhập số nguyên: ");
        int number = sc.nextInt();

        // Tính tổng các chữ số
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; // Lấy chữ số cuối cùng
            sum += digit; // Cộng chữ số vào tổng
            temp /= 10; // Loại bỏ chữ số cuối cùng
        }

        // In kết quả
        System.out.println("Tổng các chữ số của số " + number + " là: " + sum);

        sc.close();
    }
}
