import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tọa độ tâm hình tròn:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Diem tam = new Diem(x, y);

        System.out.print("Nhập bán kính: ");
        int r = sc.nextInt();

        HinhTron ht = new HinhTron(tam, r);
        ht.inHinhTron();

        System.out.printf("Chu vi: %.2f\n", ht.tinhChuVi());
        System.out.printf("Diện tích: %.2f\n", ht.tinhDienTich());
    }
}
