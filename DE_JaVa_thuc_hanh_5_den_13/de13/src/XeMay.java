public class XeMay extends PTGT {
    private double congSuat;

    public XeMay(String hang, int nam, double gia, String mau, double congSuat) {
        super(hang, nam, gia, mau);
        this.congSuat = congSuat;
    }

    public double getCongSuat() { return congSuat; }
    public void setCongSuat(double congSuat) { this.congSuat = congSuat; }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Công suất: " + congSuat);
    }
}
