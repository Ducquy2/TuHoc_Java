import java.util.Arrays;

public class Bai27_1_Mang {
    public static void main(String[] args) {
        //1 Khai bao mang
        String[] mangStr;
        float[] mangFl;
        double[] mangDb;
        // khoi tao mang kem theo kick thuoc
        String[] mangStr2 = new String[12]; // Chua toi da 12 ptu
        int[] mangNguyen2 = new int[9];

        // Khoi tao mang kem theo gia tri ban dau
        String[] mangStr3 = new String[]{"chi pheo","thi no","Ong giao"}; // Chua toi da 12 ptu
        int[] mangNguyen3 = new int[]{1,2,3,4,5,6};

        // truy xuat phan tu cua mang
        int[] mang4 = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(mang4[4]);

        //duyet mang
        //c1 dung for
        String[] mangStr4 = new String[]{"chi pheo","thi no","Ong giao"}; // Chua toi da 12 ptu
        int[] mangNguyen4 = new int[]{1,2,3,4,5,6};
        for (int pt : mangNguyen4){
            System.out.println(pt);
        }
        for (String pt1 : mangStr4){
            System.out.println(pt1);
        }
        // cach2 dung for duyet qua index
        for (int i=0;i<mangNguyen4.length;i++){
            System.out.println(i);
        }

        // thay doi gia tri cho mang
        mangStr4[0]="obama";
        System.out.println("mang doi : ");
        for (int i=0;i<mangStr4.length;i++){
            System.out.println(mangStr4[i]);
        }

        //update toan bo mang
        int[] mang7 =new int[]{1,2,3,4,5,6};
        for (int i =0;i<mang7.length;i++){
            mang7[i] += 5;
        }
        System.out.println("mang doi : ");
        for (int i=0;i<mang7.length;i++){
            System.out.println(mang7[i]);
        }


        //Sap xep mang tang dan
        int[] mang8 = {4,5,6,7,34,23,8};
        Arrays.sort(mang8);
        System.out.println("Mang sx tang dan :");
        System.out.println(Arrays.toString(mang8));

        //Dao nguoc mang
        int[] mang9 = {4,5,6,7,34,23,8};
        for (int i =0, j = mang9.length-1;i<j;i++,j--){
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;
        }

        System.out.println("Mang9 sau khi khoi tao : ");
        System.out.println(Arrays.toString(mang9));

        //Phep gan mang
        int[] mang10 = {6,1,3,5,6,7,34};
        int[] mang11 = mang10;
        mang10[0]=101; // Gan mang tu vi tri [0]
        System.out.println(Arrays.toString(mang11));
        System.out.println(Arrays.toString(mang10));

        //Clone
        int[] mang12 = {6,1,3,5,6,7,34};
        int[] mang13 = mang12.clone();
        mang12[0]=99;
        System.out.println(Arrays.toString(mang13));
        System.out.println(Arrays.toString(mang12));

    }
}
