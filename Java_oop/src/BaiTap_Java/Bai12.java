package BaiTap_Java;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
//        Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b.

        System.out.print("Nhap so a : ");
        int a = nhap();
        System.out.print("Nhap so b : ");
        int b = nhap();
        System.out.println("ucln cua "+a+" va "+b+" la : "+UCLN(a,b));
        System.out.println("bcnn cua "+a+" va "+b+" la : "+((a*b)/UCLN(a,b)));

    }

//    Ham tim ucln
    public static int UCLN(int a, int b){
        while (a!=b){
            if (a > b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        return a;
    }
//  Ham nhap
    public static int nhap(){
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check){
            System.out.println(" ");
            try {
                n = sc.nextInt();
                check=true;
            }catch (Exception e){
                System.out.println("Ban phai nhap so : ");
                sc.nextInt();
            }
        }
        return n;
    }

}
