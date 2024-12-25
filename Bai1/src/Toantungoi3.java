import java.util.Scanner;

public class Toantungoi3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dtb :");
        float dtb = sc.nextFloat();

        String kq = (dtb >= 8.5)?"Loai gioi": (6.5<=dtb && dtb<8.5 ? "loại khá" :
                ( 3.5<=dtb && dtb <6.5? "loại trung bình":"loại yếu" ));

        System.out.println(kq);
    }
}
