import java.util.Scanner;

public class baitieptheo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Nhap so a : ");
            int a = sc.nextInt();
            while (a <=0){
                System.out.print("Nhap lai a: ");
                a = sc.nextInt();
            }
            System.out.println("Ban da nhap "+a);
            // kiem tra so nguyen to
            int demUoc = 0;
            for (int i =1 ; i <= a;i++){
                if (a%i == 0){
                    demUoc++;
                }
            }
            if (demUoc == 2){
                System.out.println(a +" la so nguyen to");
            }else {
                System.out.println(a + " ko phai la so nto");
            }
            System.out.println("Nhap y de thoat!");
            String traloi = new Scanner(System.in).nextLine();
            if (traloi.equals("y")|| traloi.equals("Y")){
                break;
            }
        }
    }
}
