import java.util.Scanner;

public class Caudk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tong : ");
        double tong = sc.nextDouble();
        System.out.print("Nhap hieu : ");
        double hieu = sc.nextDouble();

        double x = (tong + hieu)/2;
        double y = tong - x;

        System.out.println("x : "+x);
        System.out.println("y : "+y);


    }
}
