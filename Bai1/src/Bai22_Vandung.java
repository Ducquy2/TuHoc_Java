import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai22_Vandung {
    public static void main(String[] args) {
        int day = 0, month = 0, year = 0, tuoi;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhap day : ");
            day = sc.nextInt();
            System.out.println("Nhap month : ");
            month = sc.nextInt();
            System.out.println("Nhap year : ");
            year = sc.nextInt();

            if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > Calendar.getInstance().get(Calendar.YEAR)) {
                throw new IllegalArgumentException("Ngay thang nam sinh khong hop le.");
            }

            Calendar cal = Calendar.getInstance();
            cal.set(year, month - 1, day);
            int namSinh = cal.get(Calendar.YEAR);
            int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
            int thangSinh = cal.get(Calendar.MONTH);
            System.out.println("Ngay thang nam sinh cua ban la: " + ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);

            // Lay nam hien tai
            Calendar now = Calendar.getInstance();
            int namHienTai = now.get(Calendar.YEAR);
            tuoi = namHienTai - namSinh;
            System.out.println("Tuoi cua ban la: " + tuoi + " tuoi");

        } catch (InputMismatchException e) {
            System.out.println("Nhap du lieu khong hop le. Vui long nhap so nguyen.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Da xay ra loi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
