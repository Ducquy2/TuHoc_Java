package BaiTap_Java;

import java.util.Random;
import java.util.Scanner;

public class Bai21 {

    public static void main(String[] args) {
//        Viet 1 so ngu nhien tu 0 - 100. Sau do lan
//        luot lay ngay nhien cac so trong khoang nay cho den khi co 1  gia tri
//        dung bang gia tri nhap vao . in ra ket qua tung buoc va so buoc can thuc hien
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int count = 0;
        Random rd = new Random();

        while (true) {
            int ngauNhien = rd.nextInt(100);// sinh so trong doan tu 0-99
            count++;
            System.out.println("Random num : " + ngauNhien + "\nn: " + n);
            if (ngauNhien == n) {
                System.out.println("Thu hien " + count + " lan. ");
                break;
            }
        }

    }
}
