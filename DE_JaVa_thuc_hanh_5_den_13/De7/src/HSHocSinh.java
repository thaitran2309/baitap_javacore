public class HSHocSinh {
    private Nguoi nguoi;
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public HSHocSinh(Nguoi nguoi, String lop, String khoaHoc, String kyHoc) {
        this.nguoi = nguoi;
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void hienThiThongTin() {
        nguoi.hienThiThongTin();
        System.out.println("Lớp: " + lop);
        System.out.println("Khoá học: " + khoaHoc);
        System.out.println("Kỳ học: " + kyHoc);
        System.out.println("--------------------");
    }
}
