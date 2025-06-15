public class CBGV {
    private Nguoi nguoi;
    private double luongCung;
    private double thuong;
    private double phat;

    public CBGV(Nguoi nguoi, double luongCung, double thuong, double phat) {
        this.nguoi = nguoi;
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public double tinhLuongThucLinh() {
        return luongCung + thuong - phat;
    }

    public void hienThiThongTin() {
        nguoi.hienThiThongTin();
        System.out.println("Lương cứng: " + luongCung);
        System.out.println("Thưởng: " + thuong);
        System.out.println("Phạt: " + phat);
        System.out.println("Lương thực lĩnh: " + tinhLuongThucLinh());
        System.out.println("------------------------");
    }
}
