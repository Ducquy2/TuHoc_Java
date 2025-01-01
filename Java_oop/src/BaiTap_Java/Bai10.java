package BaiTap_Java;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
//      Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
//      Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
//      Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
        Scanner sc = new Scanner(System.in);
        String[] msv = new String[5];
        for (int i = 0;i<5;i++){
            System.out.println("Nhap msv thu "+(i+1)+" : ");
            msv[i]=sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
//                Sử dụng Matcher để so khớp từng mã số sinh viên với biểu thức chính quy.
            if (!msv[i].matches("B170[1-9]{4}"))
                System.out.println("MSSV thứ " + (i+1) + " sai định dạng!");
        }


    }
}
