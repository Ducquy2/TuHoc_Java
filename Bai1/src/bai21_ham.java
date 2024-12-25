public class bai21_ham {
    public static void main(String[] args) {
        //Goi ham xinChao
        XinChao("male");
        XinChao("female");
    }

    public static int Cong(int x, int y, int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        return x + y + z;
    }

    // Ham thu tuc
    public static void XinChao(String gioiTinh){
        if (gioiTinh.equals("female")){
            System.out.println("xin chao toi la nu!");
        } else if (gioiTinh.equals("male")) {
            System.out.println("Xin chao toi la nam!");
        }else {
            System.out.println("Ban phai nhap gioi tinh!");
        }
    }
}
