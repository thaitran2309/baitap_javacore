public class OTo extends PTGT {
    private int soCho;
    private String kieuDongCo;

    public OTo(String hang, int nam, double gia, String mau, int soCho, String kieuDongCo) {
        super(hang, nam, gia, mau);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoCho() { return soCho; }
    public void setSoCho(int soCho) { this.soCho = soCho; }

    public String getKieuDongCo() { return kieuDongCo; }
    public void setKieuDongCo(String kieuDongCo) { this.kieuDongCo = kieuDongCo; }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Số chỗ: " + soCho + ", Kiểu động cơ: " + kieuDongCo);
    }
}
