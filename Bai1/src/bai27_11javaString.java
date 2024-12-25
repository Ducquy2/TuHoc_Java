import java.util.Scanner;

public class bai27_11javaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi : ");
        String str = sc.nextLine();
        String chuoiDao = new StringBuilder(str).reverse().toString(); // dung reverse() de dao nguoc chuoi va dung toString() bien doi ep sang chuoi
        // so sanh chuoi
        if (str.equalsIgnoreCase(chuoiDao)){
            System.out.println("Day la chuoi panlydrome");
        }else {
            System.out.println("Day ko phai la chuoi panlydrome");
        }
    }
}
