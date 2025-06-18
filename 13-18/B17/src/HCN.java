public class HCN implements Comparable<HCN> {
    private double chieuDai;
    private double chieuRong;

    // Constructor
    public HCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Getter & Setter
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // Tính chu vi
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    // Tính diện tích
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Ghi đè equals để so sánh diện tích
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HCN hcn = (HCN) obj;
        return Double.compare(this.tinhDienTich(), hcn.tinhDienTich()) == 0;
    }

    // Cài đặt giao diện Comparable để so sánh diện tích
    @Override
    public int compareTo(HCN o) {
        return Double.compare(this.tinhDienTich(), o.tinhDienTich());
    }

    // In thông tin hình chữ nhật
    public void inThongTin() {
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
    }
}
