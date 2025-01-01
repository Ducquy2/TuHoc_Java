package BaiTap_Java;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
//                VD: 1 -> Một, 2 -> Hai, …
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so : ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            default:
                break;
        }
    }
}
