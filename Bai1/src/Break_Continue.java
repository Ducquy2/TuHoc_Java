public class Break_Continue {
    public static void main(String[] args) {

        int tong = 0;
        for (int i =0; i<=5;i++){
            if(i == 3){
                continue;
            }else
                tong+=i;
        }
        System.out.println("Tong : "+tong);

        // break
        int n =0;
        while (n < 100){
            System.out.println("n = "+n);
            if (n == 15){
                break;
            }
            n++;
        }
    }
}