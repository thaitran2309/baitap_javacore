import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan ks = new KhachSan();

        System.out.print("Nhập số lượng khách trọ: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho khách thứ " + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();

            System.out.print("Ngày sinh: ");
            String ngaySinh = sc.nextLine();

            System.out.print("Số CMND: ");
            String soCMND = sc.nextLine();

            System.out.print("Số ngày trọ: ");
            int soNgay = Integer.parseInt(sc.nextLine());

            System.out.print("Loại phòng: ");
            String loaiPhong = sc.nextLine();

            System.out.print("Giá phòng/ngày: ");
            double giaPhong = Double.parseDouble(sc.nextLine());

            Nguoi nguoi = new Nguoi(hoTen, ngaySinh, soCMND);
            KhachTro khach = new KhachTro(nguoi, soNgay, loaiPhong, giaPhong);
            ks.themKhach(khach);
        }

        System.out.println("\n--- Danh sách khách đang trọ ---");
        ks.hienThiTatCaKhach();

        System.out.print("\nNhập số CMND để tính tiền và xóa khách trọ: ");
        String cmnd = sc.nextLine();
        ks.tinhTienTheoCMND(cmnd);
        ks.xoaKhachTheoCMND(cmnd);

        System.out.println("\n--- Danh sách khách sau khi xóa ---");
        ks.hienThiTatCaKhach();
    }
}
