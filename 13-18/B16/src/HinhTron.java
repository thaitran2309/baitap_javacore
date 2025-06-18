public class HinhTron {
    private Diem tam;
    private int banKinh;

    // Constructor không tham số
    public HinhTron() {
        this.tam = new Diem();
        this.banKinh = 1;
    }

    // Constructor: HinhTron(Diem d, int bk)
    public HinhTron(Diem d, int bk) {
        this.tam = d;
        this.banKinh = bk;
    }

    // Constructor: HinhTron(int bk, Diem d)
    public HinhTron(int bk, Diem d) {
        this.tam = d;
        this.banKinh = bk;
    }

    // Tính chu vi
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Tính diện tích
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // In thông tin hình tròn
    public void inHinhTron() {
        System.out.print("Tâm: ");
        tam.inDiem();
        System.out.println("Bán kính: " + banKinh);
    }
}
