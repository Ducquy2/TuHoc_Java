import java.util.Scanner;

public class bai27_giaibtap {
    public static void main(String[] args) {
        //tao bang ma hoa
        String a="abcdefghijklmnopqrstuvwxyz";
        String b="zxcvbnmasdfghjklqwertyuiop";

        //nhap tin nhan can ma hoa tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap tin nhan ma hoa : ");
        String input = sc.nextLine();
        //Bien luu tin nhan sau khi dc ma hoa
        String output="";
        for (int i =0;i<input.length();i++){// chay tu 0 den input.length
            char c =input.charAt(i);
            //Tim vi tri cua ky tu trong bien a
            int index = a.indexOf(c);
            // Neu ky tu ko co trong bien a thi ko can ma hoa va them no vao output ngay
            if (index==-1){
                output += c;
            }else {
                output += b.charAt(index); // lay vi tri hien tai cua index a trong bien b
            }
        }
        // in ra kq sau ma hoa
        System.out.println( "Tin nhan sau ma hoa la : "+output);
    }
}
