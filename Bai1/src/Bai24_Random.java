import java.util.Random;

public class Bai24_Random {
    public static void main(String[] args) {
        //Khoi tao random
        Random rd = new Random();
        // lay random so nguyen
        int soNguyen = rd.nextInt(-50,51); // chay tu -50 -> <51
        System.out.println(soNguyen);


        //Neu a ko nhap thi chay tu 0
        int soNguyen1 = rd.nextInt(51); // chay tu 0 -> <51
        System.out.println(soNguyen1);

        // random so thuc
        //Chay tu -100 -> sat 1
        double x = rd.nextDouble(-100,100);
        System.out.println(x);
    }
}
