package BaiTap_Java;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
//         Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số b bất kì (1< b≤ 36).
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên ở hệ cơ số 10: ");
        int so = sc.nextInt();

        System.out.println("Nhập cơ số đích (1 < b ≤ 36): ");
        int base = sc.nextInt();
        if (base <= 1 || base > 36) {
            System.out.println("Cơ số không hợp lệ. Vui lòng nhập lại.");
        } else {
            // Chuyển đổi số và in kết quả
            String result = coSo(so, base);
            System.out.println("Số " + so + " ở hệ cơ số " + base + " là: " + result);
        }


    }

    public static String coSo(int so, int base){
        // Sử dụng StringBuilder để xây dựng chuỗi kết quả
        StringBuilder result = new StringBuilder();

        // Ký tự đại diện cho các chữ số (0-9, A-Z)
        char[] digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        // Thực hiện phép chia liên tiếp
        while (so > 0) {
            int remainder = so % base;
            result.insert(0, digits[remainder]);
            // Thêm phần dư vào đầu chuỗi kết quả
            so = so / base;
        }
        return result.toString();
    }
}
