import javax.xml.transform.Source;
import java.util.Scanner;

public class Baitap27_giaibaitap2 {
    public static void main(String[] args) {



//        boolean kq =  checkMk("aaaaAAAAA1");
//        if (kq==true){
//            System.out.println("Mk hợp lệ");
//        }else {
//            System.out.println("Mk ko hợp lệ");
//        }

        Scanner sc = new Scanner(System.in);
        String pass ="";
        //1. Moi nhap  mk và kiểm tra tính hợp lệ
        while (true){
            //nhap mk moi
            System.out.println("Mời thiết lập mk");
            System.out.println("Nhap it nhat 6 ly tu, 1 chu cái, 1 số : ");
            String newPass = sc.nextLine();
            if (checkMk(newPass)){
                pass=newPass;
                System.out.println("Mk đã được nhập!");
                break;
            }
            else
                System.out.println("Mk ko hợp lệ");
        }
        //Cho ng dung nhap 5 lan ko duoc thi out
        int count=0;
        String login = "";
        while (true){
            //nhap mk
            System.out.println("Moi nhap mk: ");
            login = sc.nextLine();
            //Kiem tra mk co khop ko
            if (login.equals(pass)){
                System.out.println("Dang nhap thanh cong");
                break;
            }
            else {
                System.out.println("Mk ko dung, moi nhap lai: ");
                count++;
            }
            if (count==5){
                System.out.println("Ban nhap qua 5 lan");
                break;
            }
        }

    }
    //Ham kiem tra tinh hop le cua mk
    public static boolean checkMk(String pass){
        //kiem tra do dai
        if (pass.length()<6){ //Neu ml < 6 thì return về true
            return false;
        }
        //kiem tra mat khau chua it nhat 1 chu cai hay ko
        boolean hasLatter =false;
        for (char c : pass.toCharArray()){
            if (Character.isLetter(c)){
                hasLatter=true;
                break;
            }
        }
        if (!hasLatter) {
            return false;
        }

        //kiem tra mat khau chua it nhat 1 so hay ko
        boolean hasNumber =false;
        for (char c : pass.toCharArray()){
            if (Character.isLetter(c)){
                hasNumber=true;
                break;
            }
        }
        if (!hasNumber){
            return false;
            // Neu mat khau ko du do dai chứa ít nhất 1 chữ cái và ít nhất 1 chữ số thì trả về true
        }
        return true;

    }
}
