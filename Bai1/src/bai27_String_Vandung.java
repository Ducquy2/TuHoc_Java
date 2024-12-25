import java.util.Scanner;

public class bai27_String_Vandung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi nhap vao 1 chuoi : ");
        //Doc va gan du lieu
        String s = sc.nextLine();
        //Gan bien dem
        int demSo=0;
        int demInThuong=0;
        int demInHoa=0;
        int demSpace=0;
        System.out.println(s.length());
        for (int i =0;i< s.length();i++){
            char c = s.charAt(i);
            if (Character.isLowerCase(c)){
                demInThuong++;
            } else if (Character.isUpperCase(c)) {
                demInHoa++;
            } else if (Character.isDigit(c)) {
                demSo++;
            } else if (Character.isWhitespace(c)) {
                demSpace++;
            }

        }
        System.out.println("So luong ky tu thuong : "+demInThuong);
        System.out.println("So luong ky tu in hoa : "+demInHoa);
        System.out.println("So luong ky tu so : "+demSo);
        System.out.println("So luong ky tu space : "+demSpace);
    }
}
