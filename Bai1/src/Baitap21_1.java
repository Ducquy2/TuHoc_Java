import java.util.Scanner;

public class Baitap21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a : ");
        double a = sc.nextDouble();
        System.out.print("Nhap b : ");
        double b = sc.nextDouble();
        System.out.print("Moi nhap ky tu +, -, *, /. : ");
        String phepTinh = new Scanner(System.in).nextLine();
        switch (phepTinh){
            case "+":
                Cong(a,b);
                break;
            case "-":
                Tru(a,b);
                break;
            case "*":
                Nhan(a,b);
                break;
            case "/":
                Chia(a,b);
                break;
            default:
                System.out.println("Phim ko hop le!");
                break;
        }

    }

    public static void Cong(double a, double b){
        double kq = a + b;
        System.out.println("kq = "+kq);
    }public static void Tru(double a, double b){
        double kq = a - b;
        System.out.println("kq = "+kq);
    }public static void Nhan(double a, double b){
        double kq = a * b;
        System.out.println("kq = "+kq);
    }public static void Chia(double a, double b){
        if (b == 0){
            System.out.println("Ko the thuc hien!");
        }else {
            double kq = a / b;
            System.out.println("kq = " + kq);
        }
    }


}
