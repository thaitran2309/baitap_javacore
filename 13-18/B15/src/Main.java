import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tọa độ điểm A (x y): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Diem A = new Diem(x1, y1);

        System.out.println("Nhập tọa độ điểm B (x y): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Diem B = new Diem(x2, y2);

        System.out.println("Nhập tọa độ điểm C (x y): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        Diem C = new Diem(x3, y3);

        TamGiac tg = new TamGiac(A, B, C);
        tg.inTamGiac();

        System.out.printf("Chu vi tam giác: %.2f\n", tg.tinhChuVi());
        System.out.printf("Diện tích tam giác: %.2f\n", tg.tinhDienTich());
    }
}
