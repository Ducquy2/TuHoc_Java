import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class baitap_28_1 {
    public static void main(String[] args) {
        // viet chuong trinh tao list co n ptu, n nhap tu ban phim
//        cac ptu la so ngau nhien  tu (1,100)
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n ptu : ");
        int n = sc.nextInt();
        Random rd = new Random();

//        Tao danh sach list kieu la so nguyen
        ArrayList<Integer> lst = new ArrayList<>();
//        Tao cac ptu ngau nhien
        for (int i = 0;i < n;i++){
            int ngauNhien = rd.nextInt(1,101);
            lst.add(ngauNhien);
        }
//        in danh sach
        System.out.println(lst);
    }
}
