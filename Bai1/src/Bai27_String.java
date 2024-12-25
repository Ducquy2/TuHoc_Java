import java.util.SortedMap;

public class Bai27_String {
    public static void main(String[] args) {
        String s = "Hom nay em dep lam" +
                "\nCho anh lam quen nhe!";
        System.out.println(s);

        //StringBuilder quan ly mot chuoi co the thay doi kich thuoc va noi dung
        StringBuilder sb = new StringBuilder();
        //append them String vao cuoi chuoi goc
        sb.append("Xin chao, ");
        sb.append("minh moi hoc lap trinh!");
        sb.append(", rat vui lam quen ");
        System.out.println(sb);

        //insert(vi tri index, chuoi can chen) Chen string vao vi tri index
        sb.insert(2,"obama");
        System.out.println(sb);

        //delete Xoa tat ca cac ky tu tu vij tri start den end -1
        sb.delete(2,7);
        System.out.println(sb);

        //string.length tra ve do dai cua chuoi ke ca space
        System.out.println(sb.length());

        //indexOf Kiem tra vi tri xuat hien dau tien cua ky tu hoac chuoi
        //tra ve -1 neu ko tim thay
        String s7 = " toi di tim toi";
        System.out.println(s7.indexOf("toi"));
        //lastIndexOf  Kiem tra vi tri xuat hien cuoi cung cua ky tu hoac chuoi
        //tra ve -1 neu ko tim thay
        System.out.println(s7.lastIndexOf("toi"));

        //contains kiem tra chuoi con
        String s9 = ".mp3";
        String s10= "tuhoc.mp3";
        //Kiem tra s10 co chua s9 ko
        boolean check = s10.contains(s9);
        if (check){
            System.out.println("Co .mp3 trong chuoi!");
        }else {
            System.out.println("Ko chua .mp3 trong chuoi!");
        }


        //sibstring Lay 1 chuoi con tu chuoi dai hon
        // subString(int beginIndex)
        // subString(int beginIndex, int endIndex)


        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);

        String s13 = s11.substring(4,7);
        System.out.println(s13);

        //replace thay the chuoi old bang chuoi new
        String s14 = "toi di tim toi";
        String s15 = s14.replace("toi","Em");
        System.out.println(s14);
        System.out.println(s15);

        //replaceFist
        String s16 = s14.replaceFirst("toi","Ban");
        System.out.println(s14);
        System.out.println(s16);

        // trim() Xoa toan bo khoang trang dau cuoi
        String s2 = "       Nguyen Quy      ";
        String s22 = s2.trim();
        System.out.println(s2);
        System.out.println(s22);

        // trim() xoa toan bo khoang trang o cuoi
        // cach 1 : Bieu thuc chinh quy (regular expression)
        // Dung \s+$ de xoa toan bo khoang trang o cuoi chuoi
        String s20 = s2.replaceAll("\\s+$","");
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println(s20);
        System.out.println(s20.length());

        //Cach 2 : xoa khoang trang cuoi chuoi bang vong lap
        String s21 = "          Ga lai lap trinh          ";
        while (s21.endsWith(" ")){
            s21 = s21.substring(0,s21.length()-1);
        }
        System.out.println(s21);


        //trim() xoa toan bo khoang trang o dau
        // dung ^\\s+ de xoa tat ca khoang trang o dau chuoi
        String s23 = "          Ga lai lap trinh          ";
        String s24 = s23.replaceFirst("^\\s+","");
        System.out.println(s24);

        //Cach 2 : xoa khoang trang dau chuoi bang vong lap
        String s25 = "          Ga lai lap trinh          ";
        while (s25.startsWith(" ")){
            s25=s25.substring(1);
        }
        System.out.println(s25);

        //compareTo, compareToIgnorecase : so sanh 2 chuoi
        //2 chuoi giong nhau
        String st1 = "abcdefg123";
        String st2 = "abcdefg123";
        int x = st1.compareTo(st2);
        //tr ve 0
        System.out.println("x = "+x);

        //2 chuoi khac nhau phan biet hoa thuong
        String st3 = "Abcdefg123";
        String st4 = "abcdefg123";
        //A co gia tri 65 trong ASII
        //a co gia tri 97 trong ASII
        //65-97=-32
        int x1 = st3.compareTo(st4);
        // tr ve x1 = -32
        System.out.println("x1 = "+x1);

        // 2 chuoi khac nhau phan biet hoa thuong
        String st5 = "Abcdefg123";
        String st6 = "abcdefg123";
        int x2 = st5.compareToIgnoreCase(st6);
        // tr ve x2 = 0
        System.out.println("x2 = "+x2);

        //spit tach chuoi
        String st7 = "hello, aetv";
        String[] mang = st7.split(",");
        // duyet mang
        for (int i =0;i<mang.length;i++){
            System.out.println(mang[i]);
        }


        //lowercase() tra ve chu thuong
        String st8 = "Toi hoc lap tring tuhoCSSD.cc";
        String st9 = st8.toLowerCase();
        System.out.println(st9);
        //touppercase() chuyen het sang hoa
        String st10 = st8.toUpperCase();
        System.out.println(st10);

        //ToCharArray() tach chuoi thanh tung ky tu, cho vao mang
        String ss1 = "asfsgafgsdfgasdf123@";
        char[] mang2 = ss1.toCharArray();//a
//        duyetmang
        for (int i =0;i<mang2.length;i++){
            System.out.println(mang2[i]);
        }

        //reverse() dao nguoc chuoi
        String ss2 = "123234sdfsdfsd";
        // khai bao doi tuong thuoc class Stringbuilder
        StringBuilder sb1 = new StringBuilder(ss2);
        sb1.reverse();
        String ss4 = sb1.toString();
        System.out.println(ss4);
        System.out.println(sb1);













    }
}
