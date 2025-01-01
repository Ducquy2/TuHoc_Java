import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Baitap_vandung27 {
    public static void main(String[] args) {

        //1. viet chuong trinh tao 1 mang 1 chieu gom cac ptu la so nguyen, co n
        //ptu nagu nghien, n do nguoi nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Moi nhap so n ptu : ");
        int n = sc.nextInt();

        //tao mang n ptu
        int N[] = new int[n];

        //tao cac ptu ngau nhien trong mang
        for (int i=0;i<n;i++){
            int ngauNhien = rd.nextInt(4);
            N[i] = ngauNhien;

        }

        //xuat cac gia tri trong mang
        System.out.println("Mang xuat ngau nhien la : ");
        System.out.println(Arrays.toString(N));

        // dao nguoc mang va xuat gia tri dao nguoc
        for (int i =0, j = N.length-1;i<j;i++,j--){
            int temp = N[i];
            N[i] = N[j];
            N[j] = temp;
        }

        //xuat mang dao nguoc
        System.out.println("Mang dao nguoc la :");
        System.out.println(Arrays.toString(N));

        //Sap xep mang tang dan
        Arrays.sort(N);
        System.out.println("Mang tang dan la : ");
        System.out.println(Arrays.toString(N));

        //Tinh tong cac ptu trong mang
        int sum =0;
        for (int pt : N){// chay tung phan tu trong mang
            sum+=pt;// cong tung ptu trong mangBai
        }

        System.out.println("Tong cac ptu trong mang la : "+sum);

        //CHo nguoi dung nhap 1 so bat ky kiem tra xem so do ton tai ko neu co in ra man hinh
        //Cho nguoi dung nhap 1 so
        System.out.println("Moi nhap 1 so bat ky : ");
        int n1 = sc.nextInt();
        boolean check = false;
        String vitri="";
        for (int i=0;i<n;i++){
            if (N[i] == n1){
                check=true;
                vitri+=(i+"");
            }
        }
        if (check){
            System.out.println(n1+" Co ton tai trong mang voi vi tri "+vitri);
        }else {
            System.out.println(n1+" ko ton tai trong mang");
        }
    }
}
