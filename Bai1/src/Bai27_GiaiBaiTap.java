import java.util.Scanner;

public class Bai27_GiaiBaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao chuoi : ");
        String input = sc.nextLine();


        // tach chuoi thanh 2 : chuoi so va chuoi ky tu
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();
        //duyet chuoi
        for (int i=0; i < input.length();i++){
            char c = input.charAt(i);
            if (Character.isDigit(c)){
                so.append(c);
            }else if (Character.isLetter(c)){
                chuoi.append(c);
            }
        }
        System.out.println("Ky tu chuoi la : "+chuoi);
        System.out.println("Ky tu so la : "+so );
    }
}
