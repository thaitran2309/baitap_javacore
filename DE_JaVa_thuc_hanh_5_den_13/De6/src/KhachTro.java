public class KhachTro {
    private Nguoi nguoi;
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;

    public KhachTro(Nguoi nguoi, int soNgayTro, String loaiPhong, double giaPhong) {
        this.nguoi = nguoi;
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public String getSoCMND() {
        return nguoi.getSoCMND();
    }

    public double tinhTien() {
        return soNgayTro * giaPhong;
    }

    public void hienThiThongTin() {
        nguoi.hienThiThongTin();
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Số ngày trọ: " + soNgayTro);
        System.out.println("Giá phòng/ngày: " + giaPhong);
        System.out.println("Tổng tiền: " + tinhTien());
        System.out.println("---------------");
    }
}
