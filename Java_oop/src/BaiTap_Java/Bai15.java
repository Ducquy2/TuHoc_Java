package BaiTap_Java;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Bai15 {
//    Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
//    Ví dụ: Số 28 được phân tích thành 2 x 2 x 7

    public static void phanTichThuaSo(int num){
        //Xu ly cac thua so 2
        while (num % 2 ==0){
            System.out.print(2+ " x ");
            num /=2;
        }

        // xu ly cac thua so le
        for (int i = 3;i<=Math.sqrt(num);i+=2){
            while (num%i == 0){
                System.out.print(i+" x ");
                num/=i;
            }
        }

        // xu ly truong hop ngto lon hon 2
        if (num > 2){
            System.out.print(num);
        }else {
            // Loại bỏ dấu " x " cuối cùng
            System.out.print("\b\b\b");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so : ");
        int n = sc.nextInt();
        System.out.println("Phan tich "+n+" thanh thua so : ");
        phanTichThuaSo(n);

    }


}
