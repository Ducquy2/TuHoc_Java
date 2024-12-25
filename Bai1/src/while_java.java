import java.util.Scanner;

public class while_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap x tu 1 - 99 :");
        int x = sc.nextInt();
        while (x<1 || x >99){
            System.out.print("Nhap lai x :");
            x = sc.nextInt();
        }
        System.out.println("Ban da nhap dung x = "+x);
    }
}
