package BaiTap_Java;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
//        Ve tam giac dx
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int h = sc.nextInt();
        int x,output;

        for (int i=1;i<=h;i++){
            for (int j = 0;j<=2*h;j++){
                x=j-h;
                if (x < 0){
                    x*=-1;
                }
                output=i-x;
                if (output > 0){
                    System.out.printf("%3d",output);
                }else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
