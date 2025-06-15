import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<CBGV> danhSachCB = new ArrayList<>();

        System.out.print("Nhập số lượng cán bộ giáo viên: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho cán bộ giáo viên thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();

            System.out.print("Ngày sinh (dd/MM/yyyy): ");
            Date ngaySinh = null;
            try {
                ngaySinh = sdf.parse(sc.nextLine());
            } catch (ParseException e) {
                System.out.println("Lỗi định dạng ngày!");
                i--; // yêu cầu nhập lại
                continue;
            }

            System.out.print("Quê quán: ");
            String queQuan = sc.nextLine();

            System.out.print("Lương cứng: ");
            double luongCung = Double.parseDouble(sc.nextLine());

            System.out.print("Thưởng: ");
            double thuong = Double.parseDouble(sc.nextLine());

            System.out.print("Phạt: ");
            double phat = Double.parseDouble(sc.nextLine());

            Nguoi nguoi = new Nguoi(hoTen, ngaySinh, queQuan);
            CBGV cbgv = new CBGV(nguoi, luongCung, thuong, phat);
            danhSachCB.add(cbgv);
        }

        // Hiển thị toàn bộ cán bộ
        System.out.println("\n--- DANH SÁCH TOÀN BỘ CÁN BỘ ---");
        for (CBGV cb : danhSachCB) {
            cb.hienThiThongTin();
        }

        // In danh sách cán bộ có lương thực lĩnh >= 8 triệu
        System.out.println("\n--- DANH SÁCH CÁN BỘ CÓ LƯƠNG >= 8 TRIỆU ---");
        for (CBGV cb : danhSachCB) {
            if (cb.tinhLuongThucLinh() >= 8000000) {
                cb.hienThiThongTin();
            }
        }
    }
}
