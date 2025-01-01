package BaiTap_Java;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
//        in ra hcn dau * 5x5
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        int cc = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        int cr = sc.nextInt();

        for (int i = 0;i<cc;i++){// tang bien i
            for (int j = 0; j<cr; j++){ // tang bien j
                if (i == 0 || j == 0 || i == cc - 1 || j == cr - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(); // in xuong dong
        }
    }
}
