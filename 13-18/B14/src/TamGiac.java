public class TamGiac extends DaGiac {

    public TamGiac(int a, int b, int c) {
        super(3, new int[]{a, b, c});
    }

    public boolean laTamGiacHopLe() {
        int a = kichThuoc[0];
        int b = kichThuoc[1];
        int c = kichThuoc[2];
        return (a + b > c && a + c > b && b + c > a);
    }

    @Override
    public int tinhChuVi() {
        if (laTamGiacHopLe()) {
            return super.tinhChuVi();
        }
        return 0;
    }

    public double tinhDienTich() {
        if (!laTamGiacHopLe()) return 0;
        double p = tinhChuVi() / 2.0;
        double a = kichThuoc[0];
        double b = kichThuoc[1];
        double c = kichThuoc[2];
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));  // Công thức Heron
    }
}
