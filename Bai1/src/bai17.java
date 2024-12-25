public class bai17 {
    public static void main(String[] args) {

        int gt = 0, n = 1;
        for (int i = 1; i <= 10; i++){
            n*=i;
            gt+=n;
        }
        System.out.println("Tong la : " +gt);
    }
}
