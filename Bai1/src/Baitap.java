public class Baitap {
    public static void main(String[] args) {
        //khai bao a = 6, thuc hien bai toan
        // a, a += 3=
        //b, a -=5 =
        // c, a *=2 =
        //d, a %=5 =
        // e , cho b = 2 rut gon bieu thuc a = a -(b+7)

        int a =6;
        System.out.println("a+=3="+ (a+=3));
        System.out.println("a-=5="+ (a-=5));
        System.out.println("a*=2="+ (a*=2));
        System.out.println("a%=5="+ (a%=5));

        int a1 = 6;
        int b = 2;
        double result = b + 7;
        System.out.println("a = a -(b+7) ="+(a1-result));

    }
}
