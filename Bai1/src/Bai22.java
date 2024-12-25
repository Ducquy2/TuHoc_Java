import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Bai22 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        // Lay ngay, thang, nam
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);

        // set nam theo y muon
        cal.set(Calendar.YEAR,2003);
        cal.set(Calendar.MONTH,06);//Thang tru 0-11
        cal.set(Calendar.DAY_OF_MONTH,20);
        //Kiem tra sau khi tha doi
        int nam1 = cal.get(Calendar.YEAR);
        int thang1 = cal.get(Calendar.MONTH);
        int ngay1 = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("Ngay thang nam sinh : "+ngay1+"/"+(thang1+1)+"/"+nam1);

        // Xuat theo dinh dang
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //Tao doi tuong date
        Date date= cal.getTime();
        String s = dinhDang.format(date);
        System.out.println(s);

    }
}
