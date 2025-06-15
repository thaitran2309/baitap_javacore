public class BienLai {
    private KhachHang khachHang;
    private int chiSoCu;
    private int chiSoMoi;

    public BienLai(KhachHang khachHang, int chiSoCu, int chiSoMoi) {
        this.khachHang = khachHang;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int tinhTien() {
        return (chiSoMoi - chiSoCu) * 750;
    }

    public void hienThiThongTin() {
        khachHang.hienThiThongTin();
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Số tiền phải trả: " + tinhTien() + " VND");
        System.out.println("---------------------------");
    }
}
