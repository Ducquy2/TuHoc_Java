import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tu 10 den 50 : ");
        int a = sc.nextInt();

        while(a>=10 || a<=50){
            System.out.print("Chi nhap tu 10 den 50.\nVui long nhap lai : ");
            a = sc.nextInt();
            for (int i = 10;i<=a;i++ ){
                if (i%3 == 0){
                    System.out.println(i);
                }
            }
            break;
        }

    }
}
