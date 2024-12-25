package SinhVienn;

import java.lang.reflect.Parameter;

public class SinhVien {
    //    thuoc tinh(Giong voi bien)
//    Instance variable : la cac thuoc tinh , cac bien khai bao ngoai lop
//    Toan bo cac ham trong lop deu truy xuat duoc
    private String hoTen;
    private double diem;
    private double diemToan;
    private double diemVan;
    private double diemSinh;

//    Khi bien local va vien Instance trung ten trong ham ma muon su dung thi dung tu khoa "this"


    //    Phuong thuc co kieu tra ve
//    Contructor mac dinh
//    Khoi tao gia tri mac dinh ngay khi doi tuong vua duoc tao ra
    public SinhVien(){
        hoTen="No name";
        diem=0.0;
    }

    //    Contructor co doi so
//    local variable : la cac bien duoc khai bao trong doi so
//    cua ham hoac noi dung ham. chi ham nay moi truy xuat duoc cac bien local cua no
    public SinhVien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem=diem;
    }
// Get and set


    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //    Phuong thuc
//  Phuong thuc ko co kieu tra ve co tu khoa la void
    public void hienThiThongTin() {
        System.out.println(hoTen+" : " +diem);
    }

//    Co 2 loai phuong thuc : Co return va khong co return
//    Ham dac biet co toString : alt + insert chon toString

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //    phuong thuc co kieu tra ve la double
//    Overloading mehod
//    1. Signature goi la khac nhau neu chung khac nhau tra ve
//    - so luong cac doi so
//    - kieu du lieu cua doi so
//    - thu tu cac doi so
//    2. overloading method : trong cung class co nhieu phuong thuc co ten giong nhau
//    nhung khac nhau ve Signature
//    3. Constructor : la kieu dac biet cua overloading method
    public double TinhDtb(double diemToan, double diemVan){     // Signature 3 doi so
        return (diemToan+diemVan)/2;
    }
    public double TinhDtb(double diemToan, double diemVan,double diemSinh) {       // Signature 4 doi so
        return (diemToan+diemVan+diemSinh)/2;
    }
    //    truong hop dac biet Overloading method
//    Parameter list method : trong th ko nam ro so luong doi so dua vao
//    Java cung cap cho lua chon do la Parameter List
    public double TongDiem(Double ... arr){
        double tong = 0.0;
        for (double x :arr){
            tong+=x;
        }
        return tong;
    }


//    Co 2 dang trien khai cua phuong thuc
//    1 lop co nhieu phuong thuc , co nhung phuong thuc public ra ngoai (public, hay service method )
//    Con nhung phuong thuc chi su dung trong lop (private , goi la support method)
//    DAng 1 : Support method dung de ho tro ben trong phuong thuc. Khong truy xuat duoc ben ngoai => dung tu khoa private
//    Dang 2 : Service method : Truy xuat duoc tu ben ngoai => dung tu khoa public

    //    Support method va Service method
//    1 Support method
//    Kiem tra khi nhap hosoSV
    private boolean checkDiem(){
        return this.diem>=24;
    }
    //    2 Service method co the goi tu chuong trinh chinh
    public void checkHopLeDiem(){
        if (checkDiem()){ //Neu checkDiem = true
            System.out.println("Diem hop le!");
        }else { // checkDiem = false
            System.out.println("Kiem tra diem thi lai!");
        }
    }


}

