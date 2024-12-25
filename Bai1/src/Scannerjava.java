import java.util.Scanner;

public class Scannerjava
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap a :");
        int a = scan.nextInt();
        System.out.print("Nhap b :");
        int b = scan.nextInt();

        int s = a *b;
        int p = (a+b)*2;

        System.out.println("Dien tich :"+s);
        System.out.println("Dien chu vi :"+p);

    }
}
