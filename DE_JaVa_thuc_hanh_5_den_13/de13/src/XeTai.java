public class XeTai extends PTGT {
    private double trongTai;

    public XeTai(String hang, int nam, double gia, String mau, double trongTai) {
        super(hang, nam, gia, mau);
        this.trongTai = trongTai;
    }

    public double getTrongTai() { return trongTai; }
    public void setTrongTai(double trongTai) { this.trongTai = trongTai; }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Trọng tải: " + trongTai);
    }
}
