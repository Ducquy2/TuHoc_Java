import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu cao :");
        double cao = sc.nextDouble();
        System.out.println("Nhap can nang :");
        double nang = sc.nextDouble();

        double BMI = nang/Math.pow(cao,2);

        if (BMI < 15)
            System.out.println("Than hinh qua gay");
        else if (BMI >=15 && BMI<16)
            System.out.println("Than hinh gay");
        else if (BMI >=16 && BMI<18.5)
            System.out.println("Than hinh hoi gay");
        else if (BMI >=18.5 && BMI<25)
            System.out.println("Than hinh binh thuong");
        else if (BMI >=25 && BMI<30)
            System.out.println("Than hinh hoi beo");
        else if (BMI >=30 && BMI<35)
            System.out.println("Than hinh beo");
        else if (BMI >=35)
            System.out.println("Than hinh qua beo");
    }
}
