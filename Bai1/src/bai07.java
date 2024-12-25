import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang :");
        int thang = sc.nextInt();
        if(thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Thang co 30 ngay");
        }
        else if (thang == 2) {
            System.out.println("Nhap nam : ");
            int nam = sc.nextInt();
            if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0))
                System.out.println("Day la nam nhuan, thang 2 co 29 ngay!");
            else
                System.out.println("Day ko phai nam nhuan, thang 2 co 28 ngay!");
        }
        else{
            System.out.println("Thang co 31 ngay");
        }
    }
}
