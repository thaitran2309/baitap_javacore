public class TamGiac {
    private Diem d1, d2, d3;

    // Constructor không tham số
    public TamGiac() {
        this.d1 = new Diem();
        this.d2 = new Diem();
        this.d3 = new Diem();
    }

    // Constructor có tham số
    public TamGiac(Diem d1, Diem d2, Diem d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    // Tính độ dài các cạnh
    private double canhA() {
        return d1.khoangCach(d2);
    }

    private double canhB() {
        return d2.khoangCach(d3);
    }

    private double canhC() {
        return d3.khoangCach(d1);
    }

    // Tính chu vi
    public double tinhChuVi() {
        return canhA() + canhB() + canhC();
    }

    // Tính diện tích tam giác (Heron)
    public double tinhDienTich() {
        double a = canhA();
        double b = canhB();
        double c = canhC();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // In 3 điểm
    public void inTamGiac() {
        System.out.print("Điểm 1: "); d1.inDiem();
        System.out.print("Điểm 2: "); d2.inDiem();
        System.out.print("Điểm 3: "); d3.inDiem();
    }
}
