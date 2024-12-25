public class Bai27_tieptheo {
    public static void main(String[] args) {
        //Dem chuoi
        String a = "toi cham hoc toi chiu kho toi dep zai";
        //tach chuoi
        String[] words = a.split(" ");
        //khoi tao bien dem
        int count =0;
        for (String tu : words){
            if (tu.equals("toi")) {
                count++;
            }
        }
        // in ra ket qua
        System.out.println("So lan xuat hien tu toi trong a la : "+ count);
    }
}
