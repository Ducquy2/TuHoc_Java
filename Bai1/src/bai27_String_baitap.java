public class bai27_String_baitap {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        //Tinh tong cac so trong chuoi tren
        int sum=0;// bien tinh tong
        int count=0;// Bien luu so luong so

        // tach chuoi bang spit()
        String[] part = str1.split(" "); // day ve 1 mang va tach theo dau space " "

        // duyet qua tung phan va chuyen no sang kieu so neu co the
        for (String pt : part){
            try{
                //chuyen chuoi sang so nguyen bang parseInt() cua ;op Integer
                int num  = Integer.parseInt(pt);
                sum+=num;//Cong them so vao luong
                count++; // sau khi cong thi tang bien dem
            }catch (NumberFormatException e){
            }
        }
        //Tinh trung binh cong
        double tbc = (double) sum /count;
        System.out.println("Tổng các số: " + sum);
        System.out.println("Trung bình cộng: " + tbc);
    }
}
