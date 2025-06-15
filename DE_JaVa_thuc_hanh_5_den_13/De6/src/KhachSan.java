import java.util.ArrayList;

public class KhachSan {
    private ArrayList<KhachTro> danhSachKhach;

    public KhachSan() {
        danhSachKhach = new ArrayList<>();
    }

    public void themKhach(KhachTro khach) {
        danhSachKhach.add(khach);
    }

    public void hienThiTatCaKhach() {
        for (KhachTro kt : danhSachKhach) {
            kt.hienThiThongTin();
        }
    }

    public void xoaKhachTheoCMND(String cmnd) {
        danhSachKhach.removeIf(khach -> khach.getSoCMND().equals(cmnd));
    }

    public void tinhTienTheoCMND(String cmnd) {
        for (KhachTro kt : danhSachKhach) {
            if (kt.getSoCMND().equals(cmnd)) {
                System.out.println("Tiền cần thanh toán: " + kt.tinhTien());
                return;
            }
        }
        System.out.println("Không tìm thấy khách có CMND: " + cmnd);
    }
}
