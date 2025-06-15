import java.util.Date;

public class TheMuon {
    private String soPhieuMuon;
    private Date ngayMuon;
    private Date hanTra;
    private String tenSach;
    private SinhVien sinhVien;

    public TheMuon(String soPhieuMuon, Date ngayMuon, Date hanTra, String tenSach, SinhVien sinhVien) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.tenSach = tenSach;
        this.sinhVien = sinhVien;
    }

    public Date getHanTra() {
        return hanTra;
    }

    public void hienThiThongTin() {
        System.out.println("Số phiếu mượn: " + soPhieuMuon);
        System.out.println("Ngày mượn: " + ngayMuon);
        System.out.println("Hạn trả: " + hanTra);
        System.out.println("Tên sách: " + tenSach);
        sinhVien.hienThiThongTin();
        System.out.println("------------------------");
    }
}
