public class PTGT {
    private String hangSanXuat;
    private int namSanXuat;
    private double giaBan;
    private String mau;

    public PTGT() {}

    public PTGT(String hangSanXuat, int namSanXuat, double giaBan, String mau) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mau = mau;
    }

    // Getters & Setters
    public String getHangSanXuat() { return hangSanXuat; }
    public void setHangSanXuat(String hangSanXuat) { this.hangSanXuat = hangSanXuat; }

    public int getNamSanXuat() { return namSanXuat; }
    public void setNamSanXuat(int namSanXuat) { this.namSanXuat = namSanXuat; }

    public double getGiaBan() { return giaBan; }
    public void setGiaBan(double giaBan) { this.giaBan = giaBan; }

    public String getMau() { return mau; }
    public void setMau(String mau) { this.mau = mau; }

    public void hienThi() {
        System.out.println("Hãng: " + hangSanXuat + ", Năm: " + namSanXuat + ", Giá: " + giaBan + ", Màu: " + mau);
    }
}
