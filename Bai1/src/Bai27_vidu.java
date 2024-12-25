import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Bai27_vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so pt toi da cua mang : ");
        int n = sc.nextInt();

        //tao bo nho cho mang co n ptu(Cap phat bo nho cho mang)
        int[] N = new int[n];
        //Nhap du lieu cho tung ptu
        System.out.println("Do dai cua mang : "+N.length);
        for (int i =0;i<n;i++){
            System.out.print("N["+i+"] = "); //N[0] =
            N[i] = sc.nextInt();
        }

        //Xuat mang

        System.out.println("mang dc tao la : ");
        System.out.println(Arrays.toString(N));




    }
}
