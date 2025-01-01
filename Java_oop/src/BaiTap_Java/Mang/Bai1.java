package BaiTap_Java.Mang;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        Viet phuong thuc tra ve 1 mang so thuc gom n ptu
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang so thuc n: ");
        int n = sc.nextInt();
        float[] a = new float[n];
        a = soThuc();

    }

    // viet phuong thuc tra ve mang so thuc
    public float[] soThuc(int n){
        float[] temp = new float[n];
        Random rd = new Random();
        for (int i =0; i < n;i++){
            temp[i] = rd.nextFloat();
        }
    }
}
