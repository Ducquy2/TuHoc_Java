import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a=sc.nextInt();
        int tong = 0;
        do{
            tong+=a;
            a++;
        }while (a<=5);
            System.out.println("Tong = "+tong);
    }
}
