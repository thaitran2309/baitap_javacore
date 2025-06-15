import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HSHocSinh> danhSach = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin học sinh thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();

            System.out.print("Ngày sinh (dd/MM/yyyy): ");
            Date ngaySinh = null;
            try {
                ngaySinh = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Sai định dạng ngày!");
                continue;
            }

            System.out.print("Quê quán: ");
            String queQuan = sc.nextLine();

            System.out.print("Lớp: ");
            String lop = sc.nextLine();

            System.out.print("Khóa học: ");
            String khoa = sc.nextLine();

            System.out.print("Kỳ học: ");
            String ky = sc.nextLine();

            Nguoi nguoi = new Nguoi(hoTen, ngaySinh, queQuan);
            HSHocSinh hs = new HSHocSinh(nguoi, lop, khoa, ky);
            danhSach.add(hs);
        }

        // a. Học sinh sinh năm 1985 và quê Thái Nguyên
        System.out.println("\n--- Học sinh sinh năm 1985 và quê ở Thái Nguyên ---");
        for (HSHocSinh hs : danhSach) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(hs.getNguoi().getNgaySinh());
            int namSinh = cal.get(Calendar.YEAR);
            if (namSinh == 1985 && hs.getNguoi().getQueQuan().equalsIgnoreCase("Thái Nguyên")) {
                hs.hienThiThongTin();
            }
        }

        // b. Học sinh lớp 10A1
        System.out.println("\n--- Học sinh lớp 10A1 ---");
        for (HSHocSinh hs : danhSach) {
            if (hs.getLop().equalsIgnoreCase("10A1")) {
                hs.hienThiThongTin();
            }
        }
    }
}
