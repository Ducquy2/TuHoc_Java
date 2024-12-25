import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a : ");
        int a = sc.nextInt();
        int tong =0;

        if(a%2 != 0){
            System.out.println("Ko tinh so le ok");

        }else {
            for (int i = 0; i <= a; i+=2) {
                tong += i;
            }
            System.out.println("Tong ca so chan tu 0 -> "+a+" la : "+tong);
        }
    }
}
