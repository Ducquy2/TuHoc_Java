package BaiTap_Java;

import java.util.Scanner;

public class Bai16 {
//    Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap n
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        System.out.println("Liet ke cac so ngto la : ");
        for (int i =2;i<=n;i++){
            if (checkSoNuyenTo(i)){
                System.out.print(i+" ");
            }
        }

    }
    // ham kiem tra so ngto
    public static boolean checkSoNuyenTo(int num){
        if (num < 2){ // Nếu number nhỏ hơn 2, trả về false (vì các số nhỏ hơn 2 không phải là số nguyên tố).
            return false;
        }
        for (int  i = 2;i<= Math.sqrt(num);i++){
            // Kiểm tra xem number có chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của number không.
            // Nếu chia hết, trả về false.
            if (num%i==0){
                return false;
            }
        }
        //  Nếu không tìm thấy ước số nào, trả về true (số đó là số nguyên tố).
        return true;
    }
}