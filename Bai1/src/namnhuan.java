import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap nam :");
        int nam = sc.nextInt();

        if((nam % 4==0) && (nam %100 !=0) || (nam % 400 == 0))
            System.out.println("Day la nam nhuan");
        else
            System.out.println("Day ko phai nam nhuan");
    }
}
