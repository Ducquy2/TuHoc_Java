public class Bai23_math {
    public static void main(String[] args) {
        System.out.println("Pi = "+Math.PI);
        //tri tuyet doi
        int a = -8;
        System.out.println("Tri tuyet doi : "+Math.abs(a));
        //Max, min
        System.out.println("Max : "+Math.max(4,7));
        System.out.println("Min : "+Math.min(4,7));
        //can ba 2
        System.out.println("Can bac 2 : "+ Math.sqrt(4));
        //Luy thua
        System.out.println("Luy thua : " + Math.pow(2,4));
        //sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("Sin = "+sin);
        System.out.println("Cos = "+cos);
        System.out.println("Tan = "+tan);

    }
}
