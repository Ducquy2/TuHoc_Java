public class Bai27_bai12 {
    public static void main(String[] args) {
        String input = "    Ga LaI LAp      TRinH   ";
        System.out.println(chuanHoa(input));
    }
    //ham
    public static String chuanHoa(String input){
        input=input.trim();
        String[] mang = input.split("\\s+");
        //duyet tung mang
        for (int i =0;i<mang.length;i++){
            mang[i] = mang[i].toLowerCase(); // Bien ve ky tu thuong
            String firstChar = mang[i].substring(0,1);
            firstChar=firstChar.toUpperCase();
            mang[i] = firstChar + mang[i].substring(1); // lay tu 1
        }
        return String.join(" ",mang);
    }
}
