import java.util.Scanner;

public class tinhphuongtrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a :");
        double a = sc.nextDouble();
        System.out.print("Nhap b :");
        double b = sc.nextDouble();
        System.out.print("Nhap c :");
        double c = sc.nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;
        if (delta < 0)
            System.out.println("Phuong trinh vo nghiem ");
        else if (delta == 0){
            double x = -b/2*a ;
            System.out.println("Phuong trinh co 1 nghiem kep :"+x);
        }
        else {
            double x1 = ((-b) +Math.sqrt(delta))/2*a;
            double x2 = ((-b) -Math.sqrt(delta))/2*a;
            System.out.println("Phuong trinh co 2 nghiem \n"+"x1 :"+x1+"\nx2 :"+x2);
        }
    }
}
