import java.util.Date;

public class SinhVien {
    private String hoTen;
    private String msv;
    private Date ngaySinh;
    private String lop;

    public SinhVien(String hoTen, String msv, Date ngaySinh, String lop) {
        this.hoTen = hoTen;
        this.msv = msv;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Mã SV: " + msv);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Lớp: " + lop);
    }
}
