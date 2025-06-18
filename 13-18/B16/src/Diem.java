public class Diem {
    private double x;
    private double y;

    // Constructor không tham số
    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor có tham số
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // In ra hoành độ và tung độ
    public void inDiem() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Tính khoảng cách đến điểm khác
    public double khoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) + Math.pow(this.y - d.y, 2));
    }

    // Getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
