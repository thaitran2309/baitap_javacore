import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TheMuon> danhSach = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nhập số lượng thẻ mượn: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin thẻ mượn thứ " + (i + 1));

            System.out.print("Số phiếu mượn: ");
            String soPhieu = sc.nextLine();

            System.out.print("Ngày mượn (dd/MM/yyyy): ");
            Date ngayMuon = null;
            try {
                ngayMuon = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Ngày mượn không hợp lệ!");
                i--;
                continue;
            }

            System.out.print("Hạn trả (dd/MM/yyyy): ");
            Date hanTra = null;
            try {
                hanTra = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Hạn trả không hợp lệ!");
                i--;
                continue;
            }

            System.out.print("Tên sách mượn: ");
            String tenSach = sc.nextLine();

            // Thông tin sinh viên
            System.out.print("Họ tên SV: ");
            String hoTen = sc.nextLine();

            System.out.print("Mã SV: ");
            String msv = sc.nextLine();

            System.out.print("Ngày sinh SV (dd/MM/yyyy): ");
            Date ngaySinh = null;
            try {
                ngaySinh = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Ngày sinh không hợp lệ!");
                i--;
                continue;
            }

            System.out.print("Lớp: ");
            String lop = sc.nextLine();

            SinhVien sv = new SinhVien(hoTen, msv, ngaySinh, lop);
            TheMuon tm = new TheMuon(soPhieu, ngayMuon, hanTra, tenSach, sv);
            danhSach.add(tm);
        }

        // Hiển thị danh sách sinh viên có hạn trả vào ngày cuối tháng
        System.out.println("\n--- DANH SÁCH SINH VIÊN CẦN TRẢ SÁCH VÀO CUỐI THÁNG ---");
        for (TheMuon tm : danhSach) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(tm.getHanTra());
            int day = cal.get(Calendar.DAY_OF_MONTH);
            int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

            if (day == lastDay) {
                tm.hienThiThongTin();
            }
        }
    }
}
