import java.util.Scanner;

public class Bai26_char {
    public static void main(String[] args) {

        //Khai bao
        char ch = 'a';
        char ch2 = 66;// khoi tao
        char ch3 ; // khai bao
        System.out.println(ch2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ky tu : ");
        String input = sc.nextLine();
        char ch4 = input.charAt(0);
        System.out.println("Ky tu vua nhap : "+ch4);

        //compare so sanh 2 ky tu tr ve la 1 so nguyen dung lop Character
        System.out.println(Character.compare('a','a'));
        System.out.println(Character.compare('A','a'));
        System.out.println(Character.compare('a','A'));
    }
}
