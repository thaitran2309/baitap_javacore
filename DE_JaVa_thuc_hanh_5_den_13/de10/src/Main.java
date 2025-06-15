import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BienLai> danhSachBienLai = new ArrayList<>();

        System.out.print("Nhập số lượng hộ sử dụng điện: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin hộ thứ " + (i + 1) + " ---");

            System.out.print("Họ tên chủ hộ: ");
            String hoTen = sc.nextLine();

            System.out.print("Số nhà: ");
            String soNha = sc.nextLine();

            System.out.print("Mã công tơ: ");
            String maCongTo = sc.nextLine();

            System.out.print("Chỉ số cũ: ");
            int chiSoCu = Integer.parseInt(sc.nextLine());

            System.out.print("Chỉ số mới: ");
            int chiSoMoi = Integer.parseInt(sc.nextLine());

            if (chiSoMoi < chiSoCu) {
                System.out.println("❌ Lỗi: Chỉ số mới không được nhỏ hơn chỉ số cũ. Vui lòng nhập lại!");
                i--; // nhập lại
                continue;
            }

            KhachHang kh = new KhachHang(hoTen, soNha, maCongTo);
            BienLai bl = new BienLai(kh, chiSoCu, chiSoMoi);
            danhSachBienLai.add(bl);
        }

        System.out.println("\n===== DANH SÁCH BIÊN LAI TIỀN ĐIỆN =====");
        for (BienLai bl : danhSachBienLai) {
            bl.hienThiThongTin();
        }
    }
}
