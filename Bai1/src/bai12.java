import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen n :");
        int n = sc.nextInt();
        int gt = 1;
        for (int i=1;i<=n;i++)
            gt=gt*i;
        System.out.println(n+"!="+gt);

        //while
        System.out.print("Nhap so nguyen x :");
        int x = sc.nextInt();
        int gtx =1;
        int b =1;
        while (b<=x){
            gtx *= b;
            b++;
        }
        System.out.println(x+"!="+gtx);
    }
}
