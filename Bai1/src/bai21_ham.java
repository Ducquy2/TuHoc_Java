import java.util.Scanner;

public class bai21_ham {
    public static void main(String[] args) {
        //Goi ham xinChao
        XinChao("male");
        XinChao("female");
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nha gioi tinh : ");
        String gt = sc.nextLine();
        System.out.println(XinChao(gt));
        System.out.println("Tong la : "+Cong(2,5,7));
    }
//  Ham tinh cong
    public static int Cong(int x, int y, int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        return x + y + z;
    }



    // Ham thu tuc
    public static boolean XinChao(String gioiTinh){
        if (gioiTinh.equals("female")){//kiem tra key
            System.out.println("xin chao toi la nu!");
        } else if (gioiTinh.equals("male")) {
            System.out.println("Xin chao toi la nam!");
        }else {
            System.out.println("Ban phai nhap gioi tinh!");
        }
        return false;
    }
}
