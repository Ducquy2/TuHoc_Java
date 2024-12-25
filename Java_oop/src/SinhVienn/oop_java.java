package SinhVienn;

public class oop_java {
    public static void main(String[] args) {

//        Khoi tao doi tuong thuoc class SinhVien
        SinhVien sv = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv.hienThiThongTin();
        sv2.hienThiThongTin();
//        Phuong thuc ko kieu tra ve
        SinhVien sv3 = new SinhVien("Quy",9);
        sv3.hienThiThongTin();
//        Phuong thuc co kieu tra ve
        SinhVien sv4 = new SinhVien("Quy",8);
        double dtbSV = sv4.TinhDtb(5,9);
        System.out.println("Diem tb la : "+dtbSV);
//        Get de hien thi thong tin
        sv4.getDiem();
        sv4.getHoTen();
//        Set de sua thong tin
        sv4.setDiem(7.9);
        sv4.setHoTen("Duc Quy");
        sv4.hienThiThongTin();

//        test toString
        System.out.println(sv4);


//    Support method va Service method
        SinhVien sv5 = new SinhVien("Duc quy",25);

        sv5.hienThiThongTin();
//        sv5.checkDiem(); // Support method ko the goi tu ben ngoai
        sv5.checkHopLeDiem();

//    Parameter list method
        double tongDiem = sv5.TongDiem(1.0,4.0,5.5,6.7,7.7);
        System.out.println(tongDiem);



    }
}
