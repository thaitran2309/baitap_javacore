public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maCongTo;

    public KhachHang(String hoTen, String soNha, String maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên chủ hộ: " + hoTen);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã công tơ: " + maCongTo);
    }
}
