package Congty;

public class Mainn {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Quy","Vinh Phuc",202112040);
        double luongnv = nv.tinhLuong();
        System.out.println(nv);
        System.out.println(luongnv);
//        Tao doi tuong nhan vien hanh chinh
        NhanVienHanhChinh nv1 = new NhanVienHanhChinh("Quy1","Vinh Phuc",20211284);
        double luonghc = nv.tinhLuong();
        System.out.println(nv1);
        System.out.println(luonghc);
//        Tao doi tuong nhan vien di ca
        NhanVienDiCa nv2 = new NhanVienDiCa("Quy2","Vinh Phuc",20211284);
        double luongdc = nv.tinhLuong();
        System.out.println(nv2);
        System.out.println(luongdc);
    }
}
