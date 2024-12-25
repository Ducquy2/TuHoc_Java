import java.util.Scanner;

public class Baitap21 {
    public static void main(String[] args) {
        /*Viet chuong trinh giai ptb2 dun ham :
        1. Tim nghiem cua ptb2 voi : a = 1, b = 2, c = 3
        2. Tim nghiem cua ptb2 voi : a = 1, b = 2, c = 1
        3. Tim nghiem cua ptb2 voi : a = 1, b = 2, c = -3*/
        String kq = giaiPtb2(1,2,3);
        String kq2 = giaiPtb2(1,2,1);
        String kq3 = giaiPtb2(1,2,-3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);

        // Nhap tu ban phim
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a : ");
        double a = sc.nextDouble();
        System.out.print("Nhap b : ");
        double b = sc.nextDouble();
        System.out.print("Nhap c : ");
        double c = sc.nextDouble();

        String kq4 = giaiPtb2(a,b,c);
        System.out.println(kq4);



    }
    //Ham gia ptb2
    public static String giaiPtb2(double a,double b, double c ){
        //Neu a = 0 thi la ptb1
        if (a == 0){
            if (b == 0 && c == 0){
                return "Phuong tring b1  vo so n";
            } else if (b == 0 && c != 0) {
                return "Pt vo n";
            }else {
                return "Pt b1 co nghiem" + (-c/b);
            }
        }else {
            // giai ptb2
            double detal = (b*b)-(4*a*c);
            if (detal < 0){
                return "Ptb2 vo n";
            } else if (detal == 0) {
                double x = -b/(2*a);
                return "Pt co n x = "+x;
            }else {
                double x1 = (-b + Math.sqrt(detal))/ (2*a);
                double x2 = (-b - Math.sqrt(detal))/ (2*a);
                return "Pt co 2 nghiem la x1 = "+x1+" va x2 = "+x2;

            }
        }
    }
}
