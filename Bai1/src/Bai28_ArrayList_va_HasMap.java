import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_ArrayList_va_HasMap {
    public static void main(String[] args) {
//        2 lop collection thuong gap la
//        ArrayList va HasMap
//        1. ArrayList : Nó giống như 1 mảng, nhưng có thể co dãn các phẩn tử
//        2. HasMap : Cho phép lưu trữ các cặp key, value và tìm kiếm giá trị bằng key


//        Khai báo list : ArrayList<type>listname = new ArrayList<>();
        ArrayList<Integer> lst = new ArrayList<>();
//        Khai bao voi so luong ptu ban dau
        ArrayList<Integer> lst2 = new ArrayList<>(5);
//        Khoi tao list voi cac ptu ban dau
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));

//        Xuat list
        System.out.println("Xuat list : ");
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);
        System.out.println("-----------");

//        Add them ptu
        ArrayList<Integer>lst4=new ArrayList<>();
//        add ptu
        lst4.add(8);
        lst4.add(6);
        lst4.add(9);
//        Xuat ptu
        System.out.println("Xuat khi add ptu : ");
        System.out.println(lst4);
//        add(index, element) vao vi tri chi dinh
        lst4.add(1,99);
//      Xuat ptu
        System.out.println("Xuat khi add ptu chi dinh : ");
        System.out.println(lst4);
        System.out.println("-----------");


//        size : tra ve so ptu cua list
        System.out.println("So ptu cua lst4 la : " + lst4.size());
        System.out.println("-----------");


//        get(int index) tra ve gia tri list tai vi tri index
        System.out.println("Tra ve gia tri trong list : ");
        System.out.println(lst4.get(3));
        System.out.println("-----------");


//        remove (index)
        lst4.remove(1);
        System.out.println("Xoa vi tri index : ");
        System.out.println(lst4);
        System.out.println("-----------");


//        remove(1 ptu dc chi dinh)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst5 = "+lst5);
        lst5.remove(Integer.valueOf(3));// xoa gia tri 3
        System.out.println("Vi tri 3 sau khi dc xoa : "+lst5);
        System.out.println("-----------");


//      set(index, element) : thay doi thong tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("lst6 = "+lst6);
        lst6.set(2,99); // thay doi vi tri index 2 = 99 (tu gia tri 3 -> 99)
        System.out.println("lst6 sau khi thay doi : "+lst6);
        System.out.println("-----------");


//        contains() kiem tra collection co chua ptu nao do hay khong
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean ktra = lst7.contains(4);// kiem tra xem lst7 co chua ptu 4 hay ko
        System.out.println(ktra);
        System.out.println("-----------");

//        collections.sort(list) : sắp xếp tăng dần
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(6,72,53,34,95,16));
        System.out.println(lst8);
        Collections.sort(lst8);
        System.out.println("Lst8 sau sap xep la : ");
        System.out.println(lst8);
        System.out.println("-----------");


//        indexOf() tim vi tri dau tien cua element trong list
//        neu ko tim thay tra ve -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(6,72,53,34,95,16));
        System.out.println(lst9);
        System.out.println(lst9.indexOf(6));   // tim vi tri cua element tron list
        System.out.println("-----------");

//

//        Duyet list
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(6,72,53,34,95,16));
        System.out.println("Dung for duyet list");
        for (int vl : lst10){
            System.out.println(vl);
        }
        System.out.println("-----------");

//        duyet for khi can su dung dem cac chi s0 index
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(6,72,53,34,95,16));
        for (int i =0;i<lst11.size();i++){ // dem xem co bao nhieu ptu trong list
            int vl =lst11.get(i);
            System.out.println(vl);
        }






    }
}
