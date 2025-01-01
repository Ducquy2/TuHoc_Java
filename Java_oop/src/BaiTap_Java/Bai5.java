package BaiTap_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
    public static void main(String[] args) {
//        Viết chương trình cho phép người dùng nhập vào mã số sinh viên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sv : ");
        String msv = sc.nextLine();
//Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)

//        Biểu thức chính quy kiểm tra định dạng mã số sinh viên
        String regex = "^B[1-9]{7}$";
//        Biểu thức chính quy ^B[1-9]{7}$:
//          ^ biểu thị bắt đầu chuỗi.
//          B yêu cầu ký tự đầu tiên phải là 'B'.
//          [1-9]{7} yêu cầu 7 ký tự tiếp theo phải là các số từ 1 đến 9.
//          $ biểu thị kết thúc chuỗi.


//      Pattern.compile(regex) biên dịch biểu thức chính quy thành đối tượng Pattern.
//      matcher = pattern.matcher(studentID) tạo đối tượng Matcher để so khớp studentID với biểu thức chính quy.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(msv);

//      Kiem tra dieu kien
        if (matcher.matches()){
            System.out.println("Msv hop le!");
        }else {
            System.out.println("Msv ko hop le!");
        }
    }
}
