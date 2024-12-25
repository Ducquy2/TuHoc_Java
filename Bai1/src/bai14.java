import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so le n : ");
        int n = sc.nextInt();
        int tongle = 0;
        if (n%2 !=0){
            for (int i = 1;i<=n;i+=2){
                if (i == 3){
                    break;
                }else
                    tongle+=i;
            }
            System.out.println("Tong le : "+tongle);
        }

    }
}
